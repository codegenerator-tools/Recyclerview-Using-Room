/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
 **/
package com.gui;

import android.os.Bundle;
import android.widget.Toast;

import com.codingmadeeasy.myapplication.R;
import com.database.Instrument;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class InstrumentActivity extends AppCompatActivity {

    private InstrumentViewModel viewModel;

    private List<Instrument> mainList;

    private RecyclerView recyclerView;
    private InstrumentListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrument_activity);

        //initializing all the UI elements
        recyclerView = findViewById(R.id.recyclerview);

        viewModel = new ViewModelProvider(this).get(InstrumentViewModel.class);

        adapter = new InstrumentListAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initListView();
    }

    /*
    This method shall be used to initialize the list view using observer,
    here onChanged shall be triggered realtime as the data changes
     */
    private void initListView() {

        viewModel.getAllData().observe(this, currentList -> {

            if(mainList == null) {
                mainList = new ArrayList<>();
            }
            else {

                adapter.setData(mainList);
            }
        });
    }

    /*
    Wrapper for displaying toast messages
     */
    private void ShowToast(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
