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
public interface InstrumentDao extends BaseCommonDao<Instrument> {

    @Query("SELECT * FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME)
	LiveData<List<Instrument>> getAllData();

    @Query("SELECT * FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME + " ORDER BY :orderBy") 
	LiveData<List<Instrument>> getAllData(String orderBy);

    @RawQuery(observedEntities = Instrument.class)
    LiveData<Instrument> getData(SupportSQLiteQuery query);

    @RawQuery(observedEntities = Instrument.class)
    Instrument get(SupportSQLiteQuery query);

    @RawQuery(observedEntities = Instrument.class)
    LiveData<List<Instrument>> getListData(SupportSQLiteQuery query);

    @Query("DELETE FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME)
    int deleteAllData();

    @RawQuery(observedEntities = Instrument.class)
    int delete(SupportSQLiteQuery query);

    /**
     * Table name to be utilized by BaseCommonDao to perform operations sa. execution of
     * Sqlite functions (MAX, MIN, etc..)
     */
    default String getTableName() {
        return DatabaseConstants.InstrumentTableKey.TABLE_NAME;
    }
}