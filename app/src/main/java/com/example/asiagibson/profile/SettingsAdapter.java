package com.example.asiagibson.profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by asiagibson on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SetttingsVH> {
    LayoutInflater inflater;

    Integer [] sText;

    @Override
    public SetttingsVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.from(parent.getContext()).
                inflate(R.layout.custom_row_settings,parent,false);
        return new SetttingsVH(view);
    }

    @Override
    public void onBindViewHolder(SetttingsVH holder, int position) {
       // Integer holderText =  sText.get(position);

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}