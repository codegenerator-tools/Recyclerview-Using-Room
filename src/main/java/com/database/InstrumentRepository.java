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
import androidx.sqlite.db.SimpleSQLiteQuery;

public class InstrumentRepository {

    private InstrumentDao instrumentDao;

    public InstrumentRepository(InstrumentDao instrumentDao) {

		this.instrumentDao = instrumentDao;
	}

    public LiveData<List<Instrument>> getAllData() {

        return instrumentDao.getAllData();
    }

    public LiveData<List<Instrument>> getAllData(String orderBy) {

        return instrumentDao.getAllData(orderBy);
    }

	public List<Long> insertAll(List<Instrument> data) {
        return instrumentDao.insertAll(data);
    }

	public Long insert(Instrument data) {
        return instrumentDao.insert(data);
    }

    public LiveData<Instrument> getData(String whereCondition) {

		StringBuilder finalQuery = new StringBuilder();
		finalQuery.append("SELECT * FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME);

		if(whereCondition != null && whereCondition.length() > 0) {

			finalQuery.append(" WHERE " + whereCondition);
		}

		finalQuery.append(" LIMIT 1");

		SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

		return instrumentDao.getData(simpleSQLiteQuery);
	}

   public Instrument get(String whereCondition) {

        StringBuilder finalQuery = new StringBuilder();
        finalQuery.append("SELECT * FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME);

        if(whereCondition != null && whereCondition.length() > 0) {

            finalQuery.append(" WHERE " + whereCondition);
        }

        finalQuery.append(" LIMIT 1");

        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

        return instrumentDao.get(simpleSQLiteQuery);
    }

   public int update(Instrument data) {
        return instrumentDao.update(data);
    }

	public LiveData<List<Instrument>> getListData(String whereCondition, String orderBy) {

        StringBuilder finalQuery = new StringBuilder ();
        finalQuery.append("SELECT * FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME);

		if(whereCondition != null && whereCondition.length() > 0) {

			finalQuery.append(" WHERE " + whereCondition);
		}

		if(orderBy != null && orderBy.length() > 0) {

			finalQuery.append(" ORDER BY " + orderBy);
		}
        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

        return instrumentDao.getListData(simpleSQLiteQuery);
    }

    public int delete(String whereCondition) {

		if(whereCondition == null || whereCondition.length() <= 0) {

			return 0;
		}

        String finalQuery = "DELETE FROM " + DatabaseConstants.InstrumentTableKey.TABLE_NAME  + " WHERE " + whereCondition;
        
        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery);

        return instrumentDao.delete(simpleSQLiteQuery);
    }

    public int deleteAllData() {

        return instrumentDao.deleteAllData();
    }

    public int delete(Instrument data) {

        return instrumentDao.delete(data);
    }
}