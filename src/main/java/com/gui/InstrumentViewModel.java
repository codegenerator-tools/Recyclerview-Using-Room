/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
 **/
package com.gui;

import android.app.Application;

import com.database.Instrument;
import com.database.InstrumentDao;
import com.database.InstrumentRepository;
import com.database.AppRoomDatabase;
import com.database.DatabaseConstants.InstrumentTableKey;

import java.util.List;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;public class InstrumentViewModel extends AndroidViewModel {

    private InstrumentRepository repository;

    private LiveData<List<Instrument>> liveData;
    private InstrumentDao dao;

    public InstrumentViewModel(Application application) {
        super(application);

        AppRoomDatabase db = AppRoomDatabase.getDatabase(application);
        dao = db.instrumentDao();

        repository = new InstrumentRepository(dao);
        liveData = repository.getAllData();
    }

    LiveData<List<Instrument>> getAllData() {

        return liveData;
    }

    Long insert(Instrument data) {

        return repository.insert(data);
    }

    int update(Instrument data) {

        return repository.update(data);
    }

    Instrument get(Integer id) {

        return repository.get(InstrumentTableKey.INSTRUMENT_ID_FIELD + " = '" + id+ "'");
    }
}
