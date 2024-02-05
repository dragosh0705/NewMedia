package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listadapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    String[] arrdatetext;

    public listadapter(Context context, String[] arrdatetext) {

        this.context= context;
        this.arrdatetext = arrdatetext;
    }

    @Override
    public int getCount() {
        return arrdatetext.length;
    }

    @Override
    public Object getItem(int position) {
        return arrdatetext[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (view == null) {
            view = inflater.inflate(R.layout.daily_list_layout, null);
        }

        ImageView dailydate = view.findViewById(R.id.date);

        dailydate.setImageResource(Integer.parseInt(arrdatetext[position]));

        return view;
    }
}
