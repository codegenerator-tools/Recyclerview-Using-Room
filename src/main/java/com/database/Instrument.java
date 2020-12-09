/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
**/

package com.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(
    tableName = (DatabaseConstants.InstrumentTableKey.TABLE_NAME))

public class Instrument {

	@PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = DatabaseConstants.InstrumentTableKey.INSTRUMENT_ID_FIELD)
	public Integer instrumentid;

	@ColumnInfo(name = DatabaseConstants.InstrumentTableKey.NAME_FIELD) public String name;

	@ColumnInfo(name = DatabaseConstants.InstrumentTableKey.TYPE_FIELD) public String type;

	public Instrument() { 

		name = null;
		type = null;
	}
}