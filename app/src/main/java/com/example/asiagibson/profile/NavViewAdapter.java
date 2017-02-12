package com.example.asiagibson.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asiagibson on 2/12/17.
 */

public class NavViewAdapter extends BaseAdapter {
    LayoutInflater inflater;

    Context mContext;
    String iconText [];
    int iconList[];

    public NavViewAdapter(Context appContext, int[] iconList, String [] iconText) {
        this.mContext = appContext;
        this.iconList = iconList;
        this.iconText = iconText;
        inflater = (LayoutInflater.from(appContext));
    }

    @Override
    public int getCount() {
        return iconText.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custon_row, null);
        ImageView icon = (ImageView) view.findViewById(R.id.iv_icon);
        TextView tv_icon = (TextView) view.findViewById(R.id.tv_icon);

        icon.setImageResource(iconList[i]);
        tv_icon.setText(iconText[i]);
        return view;
    }
}


