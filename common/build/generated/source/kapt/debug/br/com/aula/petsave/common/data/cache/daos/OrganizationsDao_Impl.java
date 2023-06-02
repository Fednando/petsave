package br.com.aula.petsave.common.data.cache.daos;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.aula.petsave.common.data.cache.model.cachedorganization.CachedOrganization;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrganizationsDao_Impl implements OrganizationsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CachedOrganization> __insertionAdapterOfCachedOrganization;

  public OrganizationsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCachedOrganization = new EntityInsertionAdapter<CachedOrganization>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `organizations` (`organizationId`,`email`,`phone`,`address1`,`address2`,`city`,`state`,`postcode`,`country`,`distance`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CachedOrganization value) {
        if (value.getOrganizationId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getOrganizationId());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmail());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        if (value.getAddress1() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress1());
        }
        if (value.getAddress2() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAddress2());
        }
        if (value.getCity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCity());
        }
        if (value.getState() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getState());
        }
        if (value.getPostcode() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPostcode());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCountry());
        }
        stmt.bindDouble(10, value.getDistance());
      }
    };
  }

  @Override
  public void insert(final List<CachedOrganization> organizations) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCachedOrganization.insert(organizations);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
