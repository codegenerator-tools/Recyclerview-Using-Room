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

public class ArtistRepository {

    private ArtistDao artistDao;

    public ArtistRepository(ArtistDao artistDao) {

		this.artistDao = artistDao;
	}

    public LiveData<List<Artist>> getAllData() {

        return artistDao.getAllData();
    }

    public LiveData<List<Artist>> getAllData(String orderBy) {

        return artistDao.getAllData(orderBy);
    }

	public List<Long> insertAll(List<Artist> data) {
        return artistDao.insertAll(data);
    }

	public Long insert(Artist data) {
        return artistDao.insert(data);
    }

    public LiveData<Artist> getData(String whereCondition) {

		StringBuilder finalQuery = new StringBuilder();
		finalQuery.append("SELECT * FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME);

		if(whereCondition != null && whereCondition.length() > 0) {

			finalQuery.append(" WHERE " + whereCondition);
		}

		finalQuery.append(" LIMIT 1");

		SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

		return artistDao.getData(simpleSQLiteQuery);
	}

   public Artist get(String whereCondition) {

        StringBuilder finalQuery = new StringBuilder();
        finalQuery.append("SELECT * FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME);

        if(whereCondition != null && whereCondition.length() > 0) {

            finalQuery.append(" WHERE " + whereCondition);
        }

        finalQuery.append(" LIMIT 1");

        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

        return artistDao.get(simpleSQLiteQuery);
    }

   public int update(Artist data) {
        return artistDao.update(data);
    }

	public LiveData<List<Artist>> getListData(String whereCondition, String orderBy) {

        StringBuilder finalQuery = new StringBuilder ();
        finalQuery.append("SELECT * FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME);

		if(whereCondition != null && whereCondition.length() > 0) {

			finalQuery.append(" WHERE " + whereCondition);
		}

		if(orderBy != null && orderBy.length() > 0) {

			finalQuery.append(" ORDER BY " + orderBy);
		}
        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery.toString());

        return artistDao.getListData(simpleSQLiteQuery);
    }

    public int delete(String whereCondition) {

		if(whereCondition == null || whereCondition.length() <= 0) {

			return 0;
		}

        String finalQuery = "DELETE FROM " + DatabaseConstants.ArtistTableKey.TABLE_NAME  + " WHERE " + whereCondition;
        
        SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(finalQuery);

        return artistDao.delete(simpleSQLiteQuery);
    }

    public int deleteAllData() {

        return artistDao.deleteAllData();
    }

    public int delete(Artist data) {

        return artistDao.delete(data);
    }
}