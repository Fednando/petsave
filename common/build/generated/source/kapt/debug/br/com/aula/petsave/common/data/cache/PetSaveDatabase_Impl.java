package br.com.aula.petsave.common.data.cache;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import br.com.aula.petsave.common.data.cache.daos.OrganizationsDao;
import br.com.aula.petsave.common.data.cache.daos.OrganizationsDao_Impl;
import com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao;
import com.raywenderlich.android.petsave.common.data.cache.daos.AnimalsDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PetSaveDatabase_Impl extends PetSaveDatabase {
  private volatile OrganizationsDao _organizationsDao;

  private volatile AnimalsDao _animalsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `photos` (`photoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `animalId` INTEGER NOT NULL, `medium` TEXT NOT NULL, `full` TEXT NOT NULL, FOREIGN KEY(`animalId`) REFERENCES `animals`(`animalId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_photos_animalId` ON `photos` (`animalId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `videos` (`videoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `animalId` INTEGER NOT NULL, `video` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tags` (`tag` TEXT NOT NULL, PRIMARY KEY(`tag`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `animals` (`animalId` INTEGER NOT NULL, `organizationId` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `description` TEXT NOT NULL, `age` TEXT NOT NULL, `species` TEXT NOT NULL, `primaryBreed` TEXT NOT NULL, `secondaryBreed` TEXT NOT NULL, `primaryColor` TEXT NOT NULL, `secondaryColor` TEXT NOT NULL, `tertiaryColor` TEXT NOT NULL, `gender` TEXT NOT NULL, `size` TEXT NOT NULL, `coat` TEXT NOT NULL, `isSpayedOrNeutered` INTEGER NOT NULL, `isDeclawed` INTEGER NOT NULL, `hasSpecialNeeds` INTEGER NOT NULL, `shotsAreCurrent` INTEGER NOT NULL, `goodWithChildren` INTEGER NOT NULL, `goodWithDogs` INTEGER NOT NULL, `goodWithCats` INTEGER NOT NULL, `adoptionStatus` TEXT NOT NULL, `publishedAt` TEXT NOT NULL, PRIMARY KEY(`animalId`), FOREIGN KEY(`organizationId`) REFERENCES `organizations`(`organizationId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_animals_organizationId` ON `animals` (`organizationId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CachedAnimalTagCrossRef` (`animalId` INTEGER NOT NULL, `tag` TEXT NOT NULL, PRIMARY KEY(`animalId`, `tag`))");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_CachedAnimalTagCrossRef_tag` ON `CachedAnimalTagCrossRef` (`tag`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `organizations` (`organizationId` TEXT NOT NULL, `email` TEXT NOT NULL, `phone` TEXT NOT NULL, `address1` TEXT NOT NULL, `address2` TEXT NOT NULL, `city` TEXT NOT NULL, `state` TEXT NOT NULL, `postcode` TEXT NOT NULL, `country` TEXT NOT NULL, `distance` REAL NOT NULL, PRIMARY KEY(`organizationId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '37c96590030c06404c3f4cac91ed59ac')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `photos`");
        _db.execSQL("DROP TABLE IF EXISTS `videos`");
        _db.execSQL("DROP TABLE IF EXISTS `tags`");
        _db.execSQL("DROP TABLE IF EXISTS `animals`");
        _db.execSQL("DROP TABLE IF EXISTS `CachedAnimalTagCrossRef`");
        _db.execSQL("DROP TABLE IF EXISTS `organizations`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPhotos = new HashMap<String, TableInfo.Column>(4);
        _columnsPhotos.put("photoId", new TableInfo.Column("photoId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhotos.put("animalId", new TableInfo.Column("animalId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhotos.put("medium", new TableInfo.Column("medium", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPhotos.put("full", new TableInfo.Column("full", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPhotos = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysPhotos.add(new TableInfo.ForeignKey("animals", "CASCADE", "NO ACTION",Arrays.asList("animalId"), Arrays.asList("animalId")));
        final HashSet<TableInfo.Index> _indicesPhotos = new HashSet<TableInfo.Index>(1);
        _indicesPhotos.add(new TableInfo.Index("index_photos_animalId", false, Arrays.asList("animalId")));
        final TableInfo _infoPhotos = new TableInfo("photos", _columnsPhotos, _foreignKeysPhotos, _indicesPhotos);
        final TableInfo _existingPhotos = TableInfo.read(_db, "photos");
        if (! _infoPhotos.equals(_existingPhotos)) {
          return new RoomOpenHelper.ValidationResult(false, "photos(br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto).\n"
                  + " Expected:\n" + _infoPhotos + "\n"
                  + " Found:\n" + _existingPhotos);
        }
        final HashMap<String, TableInfo.Column> _columnsVideos = new HashMap<String, TableInfo.Column>(3);
        _columnsVideos.put("videoId", new TableInfo.Column("videoId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideos.put("animalId", new TableInfo.Column("animalId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideos.put("video", new TableInfo.Column("video", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVideos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVideos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVideos = new TableInfo("videos", _columnsVideos, _foreignKeysVideos, _indicesVideos);
        final TableInfo _existingVideos = TableInfo.read(_db, "videos");
        if (! _infoVideos.equals(_existingVideos)) {
          return new RoomOpenHelper.ValidationResult(false, "videos(br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo).\n"
                  + " Expected:\n" + _infoVideos + "\n"
                  + " Found:\n" + _existingVideos);
        }
        final HashMap<String, TableInfo.Column> _columnsTags = new HashMap<String, TableInfo.Column>(1);
        _columnsTags.put("tag", new TableInfo.Column("tag", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTags = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTags = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTags = new TableInfo("tags", _columnsTags, _foreignKeysTags, _indicesTags);
        final TableInfo _existingTags = TableInfo.read(_db, "tags");
        if (! _infoTags.equals(_existingTags)) {
          return new RoomOpenHelper.ValidationResult(false, "tags(br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag).\n"
                  + " Expected:\n" + _infoTags + "\n"
                  + " Found:\n" + _existingTags);
        }
        final HashMap<String, TableInfo.Column> _columnsAnimals = new HashMap<String, TableInfo.Column>(24);
        _columnsAnimals.put("animalId", new TableInfo.Column("animalId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("organizationId", new TableInfo.Column("organizationId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("age", new TableInfo.Column("age", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("species", new TableInfo.Column("species", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("primaryBreed", new TableInfo.Column("primaryBreed", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("secondaryBreed", new TableInfo.Column("secondaryBreed", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("primaryColor", new TableInfo.Column("primaryColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("secondaryColor", new TableInfo.Column("secondaryColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("tertiaryColor", new TableInfo.Column("tertiaryColor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("size", new TableInfo.Column("size", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("coat", new TableInfo.Column("coat", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("isSpayedOrNeutered", new TableInfo.Column("isSpayedOrNeutered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("isDeclawed", new TableInfo.Column("isDeclawed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("hasSpecialNeeds", new TableInfo.Column("hasSpecialNeeds", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("shotsAreCurrent", new TableInfo.Column("shotsAreCurrent", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("goodWithChildren", new TableInfo.Column("goodWithChildren", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("goodWithDogs", new TableInfo.Column("goodWithDogs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("goodWithCats", new TableInfo.Column("goodWithCats", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("adoptionStatus", new TableInfo.Column("adoptionStatus", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAnimals.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAnimals = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAnimals.add(new TableInfo.ForeignKey("organizations", "CASCADE", "NO ACTION",Arrays.asList("organizationId"), Arrays.asList("organizationId")));
        final HashSet<TableInfo.Index> _indicesAnimals = new HashSet<TableInfo.Index>(1);
        _indicesAnimals.add(new TableInfo.Index("index_animals_organizationId", false, Arrays.asList("organizationId")));
        final TableInfo _infoAnimals = new TableInfo("animals", _columnsAnimals, _foreignKeysAnimals, _indicesAnimals);
        final TableInfo _existingAnimals = TableInfo.read(_db, "animals");
        if (! _infoAnimals.equals(_existingAnimals)) {
          return new RoomOpenHelper.ValidationResult(false, "animals(br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails).\n"
                  + " Expected:\n" + _infoAnimals + "\n"
                  + " Found:\n" + _existingAnimals);
        }
        final HashMap<String, TableInfo.Column> _columnsCachedAnimalTagCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsCachedAnimalTagCrossRef.put("animalId", new TableInfo.Column("animalId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedAnimalTagCrossRef.put("tag", new TableInfo.Column("tag", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCachedAnimalTagCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCachedAnimalTagCrossRef = new HashSet<TableInfo.Index>(1);
        _indicesCachedAnimalTagCrossRef.add(new TableInfo.Index("index_CachedAnimalTagCrossRef_tag", false, Arrays.asList("tag")));
        final TableInfo _infoCachedAnimalTagCrossRef = new TableInfo("CachedAnimalTagCrossRef", _columnsCachedAnimalTagCrossRef, _foreignKeysCachedAnimalTagCrossRef, _indicesCachedAnimalTagCrossRef);
        final TableInfo _existingCachedAnimalTagCrossRef = TableInfo.read(_db, "CachedAnimalTagCrossRef");
        if (! _infoCachedAnimalTagCrossRef.equals(_existingCachedAnimalTagCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "CachedAnimalTagCrossRef(br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalTagCrossRef).\n"
                  + " Expected:\n" + _infoCachedAnimalTagCrossRef + "\n"
                  + " Found:\n" + _existingCachedAnimalTagCrossRef);
        }
        final HashMap<String, TableInfo.Column> _columnsOrganizations = new HashMap<String, TableInfo.Column>(10);
        _columnsOrganizations.put("organizationId", new TableInfo.Column("organizationId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("address1", new TableInfo.Column("address1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("address2", new TableInfo.Column("address2", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("postcode", new TableInfo.Column("postcode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrganizations.put("distance", new TableInfo.Column("distance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrganizations = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOrganizations = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrganizations = new TableInfo("organizations", _columnsOrganizations, _foreignKeysOrganizations, _indicesOrganizations);
        final TableInfo _existingOrganizations = TableInfo.read(_db, "organizations");
        if (! _infoOrganizations.equals(_existingOrganizations)) {
          return new RoomOpenHelper.ValidationResult(false, "organizations(br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization).\n"
                  + " Expected:\n" + _infoOrganizations + "\n"
                  + " Found:\n" + _existingOrganizations);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "37c96590030c06404c3f4cac91ed59ac", "7ce5e3f0902ee8f5a3ed96cc48b463d9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "photos","videos","tags","animals","CachedAnimalTagCrossRef","organizations");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `photos`");
      _db.execSQL("DELETE FROM `videos`");
      _db.execSQL("DELETE FROM `tags`");
      _db.execSQL("DELETE FROM `animals`");
      _db.execSQL("DELETE FROM `CachedAnimalTagCrossRef`");
      _db.execSQL("DELETE FROM `organizations`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OrganizationsDao organizationsDao() {
    if (_organizationsDao != null) {
      return _organizationsDao;
    } else {
      synchronized(this) {
        if(_organizationsDao == null) {
          _organizationsDao = new OrganizationsDao_Impl(this);
        }
        return _organizationsDao;
      }
    }
  }

  @Override
  public AnimalsDao animalsDao() {
    if (_animalsDao != null) {
      return _animalsDao;
    } else {
      synchronized(this) {
        if(_animalsDao == null) {
          _animalsDao = new AnimalsDao_Impl(this);
        }
        return _animalsDao;
      }
    }
  }
}
