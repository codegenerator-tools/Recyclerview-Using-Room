/**
 * Auto generated using Code Generator
 *
 * For more information about this tool, please visit
 * https://www.coding-made-easy.com

 * This file is Generated on : Wed Nov 25 13:49:13 GMT+05:30 2020
 **/
package com.gui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.codingmadeeasy.myapplication.R;
import com.database.Instrument;
import com.gui.InstrumentListAdapter.InstrumentViewHolder;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
public class InstrumentListAdapter extends RecyclerView.Adapter<InstrumentViewHolder> {

    private final LayoutInflater mInflater;
    private List<Instrument> data;

    InstrumentListAdapter(Context context) {

        mInflater = LayoutInflater.from(context);
    }

    class InstrumentViewHolder extends RecyclerView.ViewHolder {

        private final TextView dataText;

        private InstrumentViewHolder(View itemView) {
            super(itemView);

            dataText = itemView.findViewById(R.id.text_recyclerview_item);
        }
    }

    @Override
    public InstrumentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.instrument_recyclerview_item, parent, false);
        return new InstrumentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(InstrumentViewHolder holder, int position) {

        if (data != null) {

            Instrument current = data.get(position);
            holder.dataText.setText(current.name+ "");
        }
        else {
            holder.dataText.setText("No Text");
        }
    }

    void setData(List<Instrument> data) {

        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (data != null)
            return data.size();
        else return 0;
    }
}
