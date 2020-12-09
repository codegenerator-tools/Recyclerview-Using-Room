/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

@Dao
public interface ArtistDao extends BaseCommonDao<Artist> {

    @Query("SELECT * FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME)
	LiveData<List<Artist>> getAllData();

    @Query("SELECT * FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME + " ORDER BY :orderBy") 
	LiveData<List<Artist>> getAllData(String orderBy);

    @RawQuery(observedEntities = Artist.class)
    LiveData<Artist> getData(SupportSQLiteQuery query);

    @RawQuery(observedEntities = Artist.class)
    Artist get(SupportSQLiteQuery query);

    @RawQuery(observedEntities = Artist.class)
    LiveData<List<Artist>> getListData(SupportSQLiteQuery query);

    @Query("DELETE FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME)
    int deleteAllData();

    @RawQuery(observedEntities = Artist.class)
    int delete(SupportSQLiteQuery query);

    /**
     * Table name to be utilized by BaseCommonDao to perform operations sa. execution of
     * Sqlite functions (MAX, MIN, etc..)
     */
    default String getTableName() {
        return DatabaseConstants.ArtistTableKey.TABLE_NAME;
    }
}