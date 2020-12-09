/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    tableName = (DatabaseConstants.ArtistTableKey.TABLE_NAME),
       foreignKeys = {
           @ForeignKey(
               entity = Instrument.class,
               parentColumns = {DatabaseConstants.InstrumentTableKey.INSTRUMENT_ID_FIELD},
               childColumns = {DatabaseConstants.ArtistTableKey.INSTRUMENT_ID_FIELD}
               /*onDelete = CASCADE)*/

               )},
		indices = {@Index(value = {DatabaseConstants.ArtistTableKey.INSTRUMENT_ID_FIELD})}
)

public class Artist {

	@PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.ARTIST_ID_FIELD)
	public Integer artistid;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.ARTIST_NAME_FIELD) public String artistname;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.STAR_RATING_FIELD) public Integer starrating;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.ACTIVE_FIELD) public Integer active;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.INITIAL_CREATE_FIELD) public Long initialcreate;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.LAST_UPDATED_FIELD) public Long lastupdated;

	@ColumnInfo(name = DatabaseConstants.ArtistTableKey.INSTRUMENT_ID_FIELD) public Integer instrumentid;

	public Artist() { 

		artistname = null;
		starrating = null;
		active = null;
		initialcreate = null;
		lastupdated = null;
		instrumentid = null;
	}
}