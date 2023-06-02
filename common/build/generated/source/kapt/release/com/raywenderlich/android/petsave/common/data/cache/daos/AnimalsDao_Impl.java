package com.raywenderlich.android.petsave.common.data.cache.daos;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedAnimalWithDetails;
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedPhoto;
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedTag;
import br.com.aula.petsave.common.data.cache.model.cachedanimal.CachedVideo;
import com.raywenderlich.android.petsave.common.data.cache.model.cachedanimal.CachedAnimalAggregate;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AnimalsDao_Impl extends AnimalsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CachedAnimalWithDetails> __insertionAdapterOfCachedAnimalWithDetails;

  private final EntityInsertionAdapter<CachedPhoto> __insertionAdapterOfCachedPhoto;

  private final EntityInsertionAdapter<CachedVideo> __insertionAdapterOfCachedVideo;

  private final EntityInsertionAdapter<CachedTag> __insertionAdapterOfCachedTag;

  public AnimalsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCachedAnimalWithDetails = new EntityInsertionAdapter<CachedAnimalWithDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `animals` (`animalId`,`organizationId`,`name`,`type`,`description`,`age`,`species`,`primaryBreed`,`secondaryBreed`,`primaryColor`,`secondaryColor`,`tertiaryColor`,`gender`,`size`,`coat`,`isSpayedOrNeutered`,`isDeclawed`,`hasSpecialNeeds`,`shotsAreCurrent`,`goodWithChildren`,`goodWithDogs`,`goodWithCats`,`adoptionStatus`,`publishedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedAnimalWithDetails value) {
        stmt.bindLong(1, value.getAnimalId());
        if (value.getOrganizationId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOrganizationId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getType());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getAge() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAge());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSpecies());
        }
        if (value.getPrimaryBreed() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPrimaryBreed());
        }
        if (value.getSecondaryBreed() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getSecondaryBreed());
        }
        if (value.getPrimaryColor() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPrimaryColor());
        }
        if (value.getSecondaryColor() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getSecondaryColor());
        }
        if (value.getTertiaryColor() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getTertiaryColor());
        }
        if (value.getGender() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getGender());
        }
        if (value.getSize() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getSize());
        }
        if (value.getCoat() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getCoat());
        }
        final int _tmp;
        _tmp = value.isSpayedOrNeutered() ? 1 : 0;
        stmt.bindLong(16, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isDeclawed() ? 1 : 0;
        stmt.bindLong(17, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.getHasSpecialNeeds() ? 1 : 0;
        stmt.bindLong(18, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getShotsAreCurrent() ? 1 : 0;
        stmt.bindLong(19, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.getGoodWithChildren() ? 1 : 0;
        stmt.bindLong(20, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.getGoodWithDogs() ? 1 : 0;
        stmt.bindLong(21, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.getGoodWithCats() ? 1 : 0;
        stmt.bindLong(22, _tmp_6);
        if (value.getAdoptionStatus() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getAdoptionStatus());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getPublishedAt());
        }
      }
    };
    this.__insertionAdapterOfCachedPhoto = new EntityInsertionAdapter<CachedPhoto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photos` (`photoId`,`animalId`,`medium`,`full`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedPhoto value) {
        stmt.bindLong(1, value.getPhotoId());
        stmt.bindLong(2, value.getAnimalId());
        if (value.getMedium() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMedium());
        }
        if (value.getFull() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFull());
        }
      }
    };
    this.__insertionAdapterOfCachedVideo = new EntityInsertionAdapter<CachedVideo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `videos` (`videoId`,`animalId`,`video`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedVideo value) {
        stmt.bindLong(1, value.getVideoId());
        stmt.bindLong(2, value.getAnimalId());
        if (value.getVideo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getVideo());
        }
      }
    };
    this.__insertionAdapterOfCachedTag = new EntityInsertionAdapter<CachedTag>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tags` (`tag`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedTag value) {
        if (value.getTag() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTag());
        }
      }
    };
  }

  @Override
  public Object insertAnimalAggregate(final CachedAnimalWithDetails animal,
      final List<CachedPhoto> photos, final List<CachedVideo> videos, final List<CachedTag> tags,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCachedAnimalWithDetails.insert(animal);
          __insertionAdapterOfCachedPhoto.insert(photos);
          __insertionAdapterOfCachedVideo.insert(videos);
          __insertionAdapterOfCachedTag.insert(tags);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flowable<List<CachedAnimalAggregate>> getAllAnimals() {
    final String _sql = "SELECT `animals`.`animalId` AS `animalId`, `animals`.`organizationId` AS `organizationId`, `animals`.`name` AS `name`, `animals`.`type` AS `type`, `animals`.`description` AS `description`, `animals`.`age` AS `age`, `animals`.`species` AS `species`, `animals`.`primaryBreed` AS `primaryBreed`, `animals`.`secondaryBreed` AS `secondaryBreed`, `animals`.`primaryColor` AS `primaryColor`, `animals`.`secondaryColor` AS `secondaryColor`, `animals`.`tertiaryColor` AS `tertiaryColor`, `animals`.`gender` AS `gender`, `animals`.`size` AS `size`, `animals`.`coat` AS `coat`, `animals`.`isSpayedOrNeutered` AS `isSpayedOrNeutered`, `animals`.`isDeclawed` AS `isDeclawed`, `animals`.`hasSpecialNeeds` AS `hasSpecialNeeds`, `animals`.`shotsAreCurrent` AS `shotsAreCurrent`, `animals`.`goodWithChildren` AS `goodWithChildren`, `animals`.`goodWithDogs` AS `goodWithDogs`, `animals`.`goodWithCats` AS `goodWithCats`, `animals`.`adoptionStatus` AS `adoptionStatus`, `animals`.`publishedAt` AS `publishedAt` FROM animals ORDER BY animalId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, true, new String[]{"photos","videos","CachedAnimalTagCrossRef","tags","animals"}, new Callable<List<CachedAnimalAggregate>>() {
      @Override
      public List<CachedAnimalAggregate> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfAnimalId = CursorUtil.getColumnIndexOrThrow(_cursor, "animalId");
            final int _cursorIndexOfOrganizationId = CursorUtil.getColumnIndexOrThrow(_cursor, "organizationId");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
            final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
            final int _cursorIndexOfPrimaryBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryBreed");
            final int _cursorIndexOfSecondaryBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "secondaryBreed");
            final int _cursorIndexOfPrimaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryColor");
            final int _cursorIndexOfSecondaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "secondaryColor");
            final int _cursorIndexOfTertiaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "tertiaryColor");
            final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
            final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
            final int _cursorIndexOfCoat = CursorUtil.getColumnIndexOrThrow(_cursor, "coat");
            final int _cursorIndexOfIsSpayedOrNeutered = CursorUtil.getColumnIndexOrThrow(_cursor, "isSpayedOrNeutered");
            final int _cursorIndexOfIsDeclawed = CursorUtil.getColumnIndexOrThrow(_cursor, "isDeclawed");
            final int _cursorIndexOfHasSpecialNeeds = CursorUtil.getColumnIndexOrThrow(_cursor, "hasSpecialNeeds");
            final int _cursorIndexOfShotsAreCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "shotsAreCurrent");
            final int _cursorIndexOfGoodWithChildren = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithChildren");
            final int _cursorIndexOfGoodWithDogs = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithDogs");
            final int _cursorIndexOfGoodWithCats = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithCats");
            final int _cursorIndexOfAdoptionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "adoptionStatus");
            final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
            final LongSparseArray<ArrayList<CachedPhoto>> _collectionPhotos = new LongSparseArray<ArrayList<CachedPhoto>>();
            final LongSparseArray<ArrayList<CachedVideo>> _collectionVideos = new LongSparseArray<ArrayList<CachedVideo>>();
            final LongSparseArray<ArrayList<CachedTag>> _collectionTags = new LongSparseArray<ArrayList<CachedTag>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedPhoto> _tmpPhotosCollection = _collectionPhotos.get(_tmpKey);
              if (_tmpPhotosCollection == null) {
                _tmpPhotosCollection = new ArrayList<CachedPhoto>();
                _collectionPhotos.put(_tmpKey, _tmpPhotosCollection);
              }
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedVideo> _tmpVideosCollection = _collectionVideos.get(_tmpKey_1);
              if (_tmpVideosCollection == null) {
                _tmpVideosCollection = new ArrayList<CachedVideo>();
                _collectionVideos.put(_tmpKey_1, _tmpVideosCollection);
              }
              final long _tmpKey_2 = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<CachedTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipphotosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedPhoto(_collectionPhotos);
            __fetchRelationshipvideosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedVideo(_collectionVideos);
            __fetchRelationshiptagsAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedTag(_collectionTags);
            final List<CachedAnimalAggregate> _result = new ArrayList<CachedAnimalAggregate>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final CachedAnimalAggregate _item;
              final CachedAnimalWithDetails _tmpAnimal;
              if (! (_cursor.isNull(_cursorIndexOfAnimalId) && _cursor.isNull(_cursorIndexOfOrganizationId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfAge) && _cursor.isNull(_cursorIndexOfSpecies) && _cursor.isNull(_cursorIndexOfPrimaryBreed) && _cursor.isNull(_cursorIndexOfSecondaryBreed) && _cursor.isNull(_cursorIndexOfPrimaryColor) && _cursor.isNull(_cursorIndexOfSecondaryColor) && _cursor.isNull(_cursorIndexOfTertiaryColor) && _cursor.isNull(_cursorIndexOfGender) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfCoat) && _cursor.isNull(_cursorIndexOfIsSpayedOrNeutered) && _cursor.isNull(_cursorIndexOfIsDeclawed) && _cursor.isNull(_cursorIndexOfHasSpecialNeeds) && _cursor.isNull(_cursorIndexOfShotsAreCurrent) && _cursor.isNull(_cursorIndexOfGoodWithChildren) && _cursor.isNull(_cursorIndexOfGoodWithDogs) && _cursor.isNull(_cursorIndexOfGoodWithCats) && _cursor.isNull(_cursorIndexOfAdoptionStatus) && _cursor.isNull(_cursorIndexOfPublishedAt))) {
                final long _tmpAnimalId;
                _tmpAnimalId = _cursor.getLong(_cursorIndexOfAnimalId);
                final String _tmpOrganizationId;
                _tmpOrganizationId = _cursor.getString(_cursorIndexOfOrganizationId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpType;
                _tmpType = _cursor.getString(_cursorIndexOfType);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final String _tmpAge;
                _tmpAge = _cursor.getString(_cursorIndexOfAge);
                final String _tmpSpecies;
                _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
                final String _tmpPrimaryBreed;
                _tmpPrimaryBreed = _cursor.getString(_cursorIndexOfPrimaryBreed);
                final String _tmpSecondaryBreed;
                _tmpSecondaryBreed = _cursor.getString(_cursorIndexOfSecondaryBreed);
                final String _tmpPrimaryColor;
                _tmpPrimaryColor = _cursor.getString(_cursorIndexOfPrimaryColor);
                final String _tmpSecondaryColor;
                _tmpSecondaryColor = _cursor.getString(_cursorIndexOfSecondaryColor);
                final String _tmpTertiaryColor;
                _tmpTertiaryColor = _cursor.getString(_cursorIndexOfTertiaryColor);
                final String _tmpGender;
                _tmpGender = _cursor.getString(_cursorIndexOfGender);
                final String _tmpSize;
                _tmpSize = _cursor.getString(_cursorIndexOfSize);
                final String _tmpCoat;
                _tmpCoat = _cursor.getString(_cursorIndexOfCoat);
                final boolean _tmpIsSpayedOrNeutered;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsSpayedOrNeutered);
                _tmpIsSpayedOrNeutered = _tmp != 0;
                final boolean _tmpIsDeclawed;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfIsDeclawed);
                _tmpIsDeclawed = _tmp_1 != 0;
                final boolean _tmpHasSpecialNeeds;
                final int _tmp_2;
                _tmp_2 = _cursor.getInt(_cursorIndexOfHasSpecialNeeds);
                _tmpHasSpecialNeeds = _tmp_2 != 0;
                final boolean _tmpShotsAreCurrent;
                final int _tmp_3;
                _tmp_3 = _cursor.getInt(_cursorIndexOfShotsAreCurrent);
                _tmpShotsAreCurrent = _tmp_3 != 0;
                final boolean _tmpGoodWithChildren;
                final int _tmp_4;
                _tmp_4 = _cursor.getInt(_cursorIndexOfGoodWithChildren);
                _tmpGoodWithChildren = _tmp_4 != 0;
                final boolean _tmpGoodWithDogs;
                final int _tmp_5;
                _tmp_5 = _cursor.getInt(_cursorIndexOfGoodWithDogs);
                _tmpGoodWithDogs = _tmp_5 != 0;
                final boolean _tmpGoodWithCats;
                final int _tmp_6;
                _tmp_6 = _cursor.getInt(_cursorIndexOfGoodWithCats);
                _tmpGoodWithCats = _tmp_6 != 0;
                final String _tmpAdoptionStatus;
                _tmpAdoptionStatus = _cursor.getString(_cursorIndexOfAdoptionStatus);
                final String _tmpPublishedAt;
                _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
                _tmpAnimal = new CachedAnimalWithDetails(_tmpAnimalId,_tmpOrganizationId,_tmpName,_tmpType,_tmpDescription,_tmpAge,_tmpSpecies,_tmpPrimaryBreed,_tmpSecondaryBreed,_tmpPrimaryColor,_tmpSecondaryColor,_tmpTertiaryColor,_tmpGender,_tmpSize,_tmpCoat,_tmpIsSpayedOrNeutered,_tmpIsDeclawed,_tmpHasSpecialNeeds,_tmpShotsAreCurrent,_tmpGoodWithChildren,_tmpGoodWithDogs,_tmpGoodWithCats,_tmpAdoptionStatus,_tmpPublishedAt);
              }  else  {
                _tmpAnimal = null;
              }
              ArrayList<CachedPhoto> _tmpPhotosCollection_1 = null;
              final long _tmpKey_3 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpPhotosCollection_1 = _collectionPhotos.get(_tmpKey_3);
              if (_tmpPhotosCollection_1 == null) {
                _tmpPhotosCollection_1 = new ArrayList<CachedPhoto>();
              }
              ArrayList<CachedVideo> _tmpVideosCollection_1 = null;
              final long _tmpKey_4 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpVideosCollection_1 = _collectionVideos.get(_tmpKey_4);
              if (_tmpVideosCollection_1 == null) {
                _tmpVideosCollection_1 = new ArrayList<CachedVideo>();
              }
              ArrayList<CachedTag> _tmpTagsCollection_1 = null;
              final long _tmpKey_5 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_5);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<CachedTag>();
              }
              _item = new CachedAnimalAggregate(_tmpAnimal,_tmpPhotosCollection_1,_tmpVideosCollection_1,_tmpTagsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getAllTypes(final Continuation<? super List<String>> continuation) {
    final String _sql = "SELECT DISTINCT type FROM animals";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flowable<List<CachedAnimalAggregate>> searchAnimalsBy(final String name, final String age,
      final String type) {
    final String _sql = "\n"
            + "    SELECT `animals`.`animalId` AS `animalId`, `animals`.`organizationId` AS `organizationId`, `animals`.`name` AS `name`, `animals`.`type` AS `type`, `animals`.`description` AS `description`, `animals`.`age` AS `age`, `animals`.`species` AS `species`, `animals`.`primaryBreed` AS `primaryBreed`, `animals`.`secondaryBreed` AS `secondaryBreed`, `animals`.`primaryColor` AS `primaryColor`, `animals`.`secondaryColor` AS `secondaryColor`, `animals`.`tertiaryColor` AS `tertiaryColor`, `animals`.`gender` AS `gender`, `animals`.`size` AS `size`, `animals`.`coat` AS `coat`, `animals`.`isSpayedOrNeutered` AS `isSpayedOrNeutered`, `animals`.`isDeclawed` AS `isDeclawed`, `animals`.`hasSpecialNeeds` AS `hasSpecialNeeds`, `animals`.`shotsAreCurrent` AS `shotsAreCurrent`, `animals`.`goodWithChildren` AS `goodWithChildren`, `animals`.`goodWithDogs` AS `goodWithDogs`, `animals`.`goodWithCats` AS `goodWithCats`, `animals`.`adoptionStatus` AS `adoptionStatus`, `animals`.`publishedAt` AS `publishedAt` FROM animals\n"
            + "      WHERE name LIKE '%' || ? || '%' AND\n"
            + "      AGE LIKE '%' || ? || '%'\n"
            + "      AND type LIKE '%' || ? || '%'\n"
            + "  ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    _argIndex = 2;
    if (age == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, age);
    }
    _argIndex = 3;
    if (type == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, type);
    }
    return RxRoom.createFlowable(__db, true, new String[]{"photos","videos","CachedAnimalTagCrossRef","tags","animals"}, new Callable<List<CachedAnimalAggregate>>() {
      @Override
      public List<CachedAnimalAggregate> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfAnimalId = CursorUtil.getColumnIndexOrThrow(_cursor, "animalId");
            final int _cursorIndexOfOrganizationId = CursorUtil.getColumnIndexOrThrow(_cursor, "organizationId");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
            final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
            final int _cursorIndexOfPrimaryBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryBreed");
            final int _cursorIndexOfSecondaryBreed = CursorUtil.getColumnIndexOrThrow(_cursor, "secondaryBreed");
            final int _cursorIndexOfPrimaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "primaryColor");
            final int _cursorIndexOfSecondaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "secondaryColor");
            final int _cursorIndexOfTertiaryColor = CursorUtil.getColumnIndexOrThrow(_cursor, "tertiaryColor");
            final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
            final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
            final int _cursorIndexOfCoat = CursorUtil.getColumnIndexOrThrow(_cursor, "coat");
            final int _cursorIndexOfIsSpayedOrNeutered = CursorUtil.getColumnIndexOrThrow(_cursor, "isSpayedOrNeutered");
            final int _cursorIndexOfIsDeclawed = CursorUtil.getColumnIndexOrThrow(_cursor, "isDeclawed");
            final int _cursorIndexOfHasSpecialNeeds = CursorUtil.getColumnIndexOrThrow(_cursor, "hasSpecialNeeds");
            final int _cursorIndexOfShotsAreCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "shotsAreCurrent");
            final int _cursorIndexOfGoodWithChildren = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithChildren");
            final int _cursorIndexOfGoodWithDogs = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithDogs");
            final int _cursorIndexOfGoodWithCats = CursorUtil.getColumnIndexOrThrow(_cursor, "goodWithCats");
            final int _cursorIndexOfAdoptionStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "adoptionStatus");
            final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
            final LongSparseArray<ArrayList<CachedPhoto>> _collectionPhotos = new LongSparseArray<ArrayList<CachedPhoto>>();
            final LongSparseArray<ArrayList<CachedVideo>> _collectionVideos = new LongSparseArray<ArrayList<CachedVideo>>();
            final LongSparseArray<ArrayList<CachedTag>> _collectionTags = new LongSparseArray<ArrayList<CachedTag>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedPhoto> _tmpPhotosCollection = _collectionPhotos.get(_tmpKey);
              if (_tmpPhotosCollection == null) {
                _tmpPhotosCollection = new ArrayList<CachedPhoto>();
                _collectionPhotos.put(_tmpKey, _tmpPhotosCollection);
              }
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedVideo> _tmpVideosCollection = _collectionVideos.get(_tmpKey_1);
              if (_tmpVideosCollection == null) {
                _tmpVideosCollection = new ArrayList<CachedVideo>();
                _collectionVideos.put(_tmpKey_1, _tmpVideosCollection);
              }
              final long _tmpKey_2 = _cursor.getLong(_cursorIndexOfAnimalId);
              ArrayList<CachedTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<CachedTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipphotosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedPhoto(_collectionPhotos);
            __fetchRelationshipvideosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedVideo(_collectionVideos);
            __fetchRelationshiptagsAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedTag(_collectionTags);
            final List<CachedAnimalAggregate> _result = new ArrayList<CachedAnimalAggregate>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final CachedAnimalAggregate _item;
              final CachedAnimalWithDetails _tmpAnimal;
              if (! (_cursor.isNull(_cursorIndexOfAnimalId) && _cursor.isNull(_cursorIndexOfOrganizationId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfAge) && _cursor.isNull(_cursorIndexOfSpecies) && _cursor.isNull(_cursorIndexOfPrimaryBreed) && _cursor.isNull(_cursorIndexOfSecondaryBreed) && _cursor.isNull(_cursorIndexOfPrimaryColor) && _cursor.isNull(_cursorIndexOfSecondaryColor) && _cursor.isNull(_cursorIndexOfTertiaryColor) && _cursor.isNull(_cursorIndexOfGender) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfCoat) && _cursor.isNull(_cursorIndexOfIsSpayedOrNeutered) && _cursor.isNull(_cursorIndexOfIsDeclawed) && _cursor.isNull(_cursorIndexOfHasSpecialNeeds) && _cursor.isNull(_cursorIndexOfShotsAreCurrent) && _cursor.isNull(_cursorIndexOfGoodWithChildren) && _cursor.isNull(_cursorIndexOfGoodWithDogs) && _cursor.isNull(_cursorIndexOfGoodWithCats) && _cursor.isNull(_cursorIndexOfAdoptionStatus) && _cursor.isNull(_cursorIndexOfPublishedAt))) {
                final long _tmpAnimalId;
                _tmpAnimalId = _cursor.getLong(_cursorIndexOfAnimalId);
                final String _tmpOrganizationId;
                _tmpOrganizationId = _cursor.getString(_cursorIndexOfOrganizationId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpType;
                _tmpType = _cursor.getString(_cursorIndexOfType);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final String _tmpAge;
                _tmpAge = _cursor.getString(_cursorIndexOfAge);
                final String _tmpSpecies;
                _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
                final String _tmpPrimaryBreed;
                _tmpPrimaryBreed = _cursor.getString(_cursorIndexOfPrimaryBreed);
                final String _tmpSecondaryBreed;
                _tmpSecondaryBreed = _cursor.getString(_cursorIndexOfSecondaryBreed);
                final String _tmpPrimaryColor;
                _tmpPrimaryColor = _cursor.getString(_cursorIndexOfPrimaryColor);
                final String _tmpSecondaryColor;
                _tmpSecondaryColor = _cursor.getString(_cursorIndexOfSecondaryColor);
                final String _tmpTertiaryColor;
                _tmpTertiaryColor = _cursor.getString(_cursorIndexOfTertiaryColor);
                final String _tmpGender;
                _tmpGender = _cursor.getString(_cursorIndexOfGender);
                final String _tmpSize;
                _tmpSize = _cursor.getString(_cursorIndexOfSize);
                final String _tmpCoat;
                _tmpCoat = _cursor.getString(_cursorIndexOfCoat);
                final boolean _tmpIsSpayedOrNeutered;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfIsSpayedOrNeutered);
                _tmpIsSpayedOrNeutered = _tmp != 0;
                final boolean _tmpIsDeclawed;
                final int _tmp_1;
                _tmp_1 = _cursor.getInt(_cursorIndexOfIsDeclawed);
                _tmpIsDeclawed = _tmp_1 != 0;
                final boolean _tmpHasSpecialNeeds;
                final int _tmp_2;
                _tmp_2 = _cursor.getInt(_cursorIndexOfHasSpecialNeeds);
                _tmpHasSpecialNeeds = _tmp_2 != 0;
                final boolean _tmpShotsAreCurrent;
                final int _tmp_3;
                _tmp_3 = _cursor.getInt(_cursorIndexOfShotsAreCurrent);
                _tmpShotsAreCurrent = _tmp_3 != 0;
                final boolean _tmpGoodWithChildren;
                final int _tmp_4;
                _tmp_4 = _cursor.getInt(_cursorIndexOfGoodWithChildren);
                _tmpGoodWithChildren = _tmp_4 != 0;
                final boolean _tmpGoodWithDogs;
                final int _tmp_5;
                _tmp_5 = _cursor.getInt(_cursorIndexOfGoodWithDogs);
                _tmpGoodWithDogs = _tmp_5 != 0;
                final boolean _tmpGoodWithCats;
                final int _tmp_6;
                _tmp_6 = _cursor.getInt(_cursorIndexOfGoodWithCats);
                _tmpGoodWithCats = _tmp_6 != 0;
                final String _tmpAdoptionStatus;
                _tmpAdoptionStatus = _cursor.getString(_cursorIndexOfAdoptionStatus);
                final String _tmpPublishedAt;
                _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
                _tmpAnimal = new CachedAnimalWithDetails(_tmpAnimalId,_tmpOrganizationId,_tmpName,_tmpType,_tmpDescription,_tmpAge,_tmpSpecies,_tmpPrimaryBreed,_tmpSecondaryBreed,_tmpPrimaryColor,_tmpSecondaryColor,_tmpTertiaryColor,_tmpGender,_tmpSize,_tmpCoat,_tmpIsSpayedOrNeutered,_tmpIsDeclawed,_tmpHasSpecialNeeds,_tmpShotsAreCurrent,_tmpGoodWithChildren,_tmpGoodWithDogs,_tmpGoodWithCats,_tmpAdoptionStatus,_tmpPublishedAt);
              }  else  {
                _tmpAnimal = null;
              }
              ArrayList<CachedPhoto> _tmpPhotosCollection_1 = null;
              final long _tmpKey_3 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpPhotosCollection_1 = _collectionPhotos.get(_tmpKey_3);
              if (_tmpPhotosCollection_1 == null) {
                _tmpPhotosCollection_1 = new ArrayList<CachedPhoto>();
              }
              ArrayList<CachedVideo> _tmpVideosCollection_1 = null;
              final long _tmpKey_4 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpVideosCollection_1 = _collectionVideos.get(_tmpKey_4);
              if (_tmpVideosCollection_1 == null) {
                _tmpVideosCollection_1 = new ArrayList<CachedVideo>();
              }
              ArrayList<CachedTag> _tmpTagsCollection_1 = null;
              final long _tmpKey_5 = _cursor.getLong(_cursorIndexOfAnimalId);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_5);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<CachedTag>();
              }
              _item = new CachedAnimalAggregate(_tmpAnimal,_tmpPhotosCollection_1,_tmpVideosCollection_1,_tmpTagsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipphotosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedPhoto(
      final LongSparseArray<ArrayList<CachedPhoto>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CachedPhoto>> _tmpInnerMap = new LongSparseArray<ArrayList<CachedPhoto>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipphotosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedPhoto(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CachedPhoto>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipphotosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedPhoto(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `photoId`,`animalId`,`medium`,`full` FROM `photos` WHERE `animalId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "animalId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndex(_cursor, "photoId");
      final int _cursorIndexOfAnimalId = CursorUtil.getColumnIndex(_cursor, "animalId");
      final int _cursorIndexOfMedium = CursorUtil.getColumnIndex(_cursor, "medium");
      final int _cursorIndexOfFull = CursorUtil.getColumnIndex(_cursor, "full");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CachedPhoto> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CachedPhoto _item_1;
          final long _tmpPhotoId;
          if (_cursorIndexOfPhotoId == -1) {
            _tmpPhotoId = 0;
          } else {
            _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
          }
          final long _tmpAnimalId;
          if (_cursorIndexOfAnimalId == -1) {
            _tmpAnimalId = 0;
          } else {
            _tmpAnimalId = _cursor.getLong(_cursorIndexOfAnimalId);
          }
          final String _tmpMedium;
          if (_cursorIndexOfMedium == -1) {
            _tmpMedium = null;
          } else {
            _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
          }
          final String _tmpFull;
          if (_cursorIndexOfFull == -1) {
            _tmpFull = null;
          } else {
            _tmpFull = _cursor.getString(_cursorIndexOfFull);
          }
          _item_1 = new CachedPhoto(_tmpPhotoId,_tmpAnimalId,_tmpMedium,_tmpFull);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipvideosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedVideo(
      final LongSparseArray<ArrayList<CachedVideo>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CachedVideo>> _tmpInnerMap = new LongSparseArray<ArrayList<CachedVideo>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipvideosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedVideo(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CachedVideo>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipvideosAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedVideo(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `videoId`,`animalId`,`video` FROM `videos` WHERE `animalId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "animalId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfVideoId = CursorUtil.getColumnIndex(_cursor, "videoId");
      final int _cursorIndexOfAnimalId = CursorUtil.getColumnIndex(_cursor, "animalId");
      final int _cursorIndexOfVideo = CursorUtil.getColumnIndex(_cursor, "video");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CachedVideo> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CachedVideo _item_1;
          final long _tmpVideoId;
          if (_cursorIndexOfVideoId == -1) {
            _tmpVideoId = 0;
          } else {
            _tmpVideoId = _cursor.getLong(_cursorIndexOfVideoId);
          }
          final long _tmpAnimalId;
          if (_cursorIndexOfAnimalId == -1) {
            _tmpAnimalId = 0;
          } else {
            _tmpAnimalId = _cursor.getLong(_cursorIndexOfAnimalId);
          }
          final String _tmpVideo;
          if (_cursorIndexOfVideo == -1) {
            _tmpVideo = null;
          } else {
            _tmpVideo = _cursor.getString(_cursorIndexOfVideo);
          }
          _item_1 = new CachedVideo(_tmpVideoId,_tmpAnimalId,_tmpVideo);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshiptagsAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedTag(
      final LongSparseArray<ArrayList<CachedTag>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CachedTag>> _tmpInnerMap = new LongSparseArray<ArrayList<CachedTag>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshiptagsAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedTag(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CachedTag>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshiptagsAsbrComAulaPetsaveCommonDataCacheModelCachedanimalCachedTag(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `tags`.`tag` AS `tag`,_junction.`animalId` FROM `CachedAnimalTagCrossRef` AS _junction INNER JOIN `tags` ON (_junction.`tag` = `tags`.`tag`) WHERE _junction.`animalId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 1; // _junction.animalId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfTag = CursorUtil.getColumnIndex(_cursor, "tag");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CachedTag> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CachedTag _item_1;
          final String _tmpTag;
          if (_cursorIndexOfTag == -1) {
            _tmpTag = null;
          } else {
            _tmpTag = _cursor.getString(_cursorIndexOfTag);
          }
          _item_1 = new CachedTag(_tmpTag);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
