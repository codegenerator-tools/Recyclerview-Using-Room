/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;


import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Artist.class, Instrument.class}, version = 1, exportSchema = false)
//@TypeConverters(Converters.class)

abstract public class AppRoomDatabase extends RoomDatabase {

	abstract public ArtistDao artistDao();
	abstract public InstrumentDao instrumentDao();

	private static volatile AppRoomDatabase INSTANCE;

	public static AppRoomDatabase getDatabase(final Context context) {

        if (INSTANCE == null) {
            synchronized (AppRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        AppRoomDatabase.class,
                        "musical_academy"
                )
                                        .build();
                }
            }
        }

        return INSTANCE;
    }
}