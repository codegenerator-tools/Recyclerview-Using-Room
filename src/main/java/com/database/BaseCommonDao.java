/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;

import android.database.Cursor;

import java.util.List;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

/**
 * Class holds the common functionality for all the DAO classes
 * s.a. insert, update, delete and sqlite functions
 */
public interface BaseCommonDao<T> {

    /**
     * Sqlite functions
     */
    interface SqliteFunctions {

        String AVERAGE = "avg";
        String COUNT = "count";
        String MAX = "max";
        String MIN = "min";
        String SUM = "sum";
        String TOTAL = "total";
    }

    /**
     * Forced to be implemented by all its child classes
     * It will be utilized for Sqlite function execution
     *
     * @return the table name
     */
    String getTableName();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    List<Long> insertAll(List<T> data);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    Long insert(T data);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    int update(T data);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    int updateAll(List<T> data);

    @Delete
    int delete(T obj);

    @RawQuery
    Cursor executeSqliteFunction(SupportSQLiteQuery query);

    /**
     * To perform the execution of Sqlite functions
     * s.a avg, count, max, min, sum, total, ..
     *
     * e.g function("max", "id", null);
     * will return the maximum value of 'id' column
     *
     * Returns the sqlite function response of the given [functionType] = BaseCommonDao.SqliteFunctions.MAX, BaseCommonDao.SqliteFunctions.MIN, etc..,
     * [columnName] or [condition], if any.
     */
    default Long function(String functionType, String columnName, String condition) {

        Long result = 0l;
        Cursor cursor;
        String rawQuery = (" select " + functionType + "(" + columnName
                + ")" + " from " + getTableName());
        if (condition != null && condition.length() > 0) {
            rawQuery += " where " + condition;
        }

        SupportSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(rawQuery.toString());
        cursor = executeSqliteFunction(simpleSQLiteQuery);

        if (cursor.moveToFirst()) {
            result = cursor.getLong(0);
            cursor.close();
        }

        return result;
    }
}