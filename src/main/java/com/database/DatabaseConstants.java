/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;

public class  DatabaseConstants {

	public interface BaseConstants {


			// If you change the database schema, you must increment the database version
		int DATABASE_VERSION = 1;
		String DATABASE_NAME = "database.db";
	}

	public interface ArtistTableKey {

			String TABLE_NAME = "artist";

			String ARTIST_ID_FIELD = "artist_id";
			String ARTIST_NAME_FIELD = "artist_name";
			String STAR_RATING_FIELD = "star_rating";
			String ACTIVE_FIELD = "active";
			String INITIAL_CREATE_FIELD = "initial_create";
			String LAST_UPDATED_FIELD = "last_updated";
			String INSTRUMENT_ID_FIELD = "instrument_id";
        }

	public interface InstrumentTableKey {

			String TABLE_NAME = "instrument";

			String INSTRUMENT_ID_FIELD = "instrument_id";
			String NAME_FIELD = "name";
			String TYPE_FIELD = "type";
        }

}
