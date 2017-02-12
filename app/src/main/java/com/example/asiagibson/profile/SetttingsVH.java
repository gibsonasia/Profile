package com.example.asiagibson.profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by asiagibson on 2/12/17.
 */

public class SetttingsVH extends RecyclerView.ViewHolder {

    Context mContext;
    TextView settingTV;

    public SetttingsVH(View view) {
        super(view);

        settingTV = (TextView) itemView.findViewById(R.id.tv_settings);

    }
    public void bind(String holderText) {
        settingTV.getResources().getString(R.string.settings_text);

    }
}
