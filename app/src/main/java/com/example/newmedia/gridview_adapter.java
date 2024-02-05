package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridview_adapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    String[] arrdailytext;
    int[] arrdailyimg;

    public gridview_adapter(Context context, String[] arrdailytext, int[] arrdailyimg) {

        this.context= context;
        this.arrdailytext = arrdailytext;
        this.arrdailyimg = arrdailyimg;
    }

    @Override
    public int getCount() {
        return arrdailytext.length;
    }

    @Override
    public Object getItem(int position) {
        return arrdailytext[position];
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
            view = inflater.inflate(R.layout.daily_grid_layout, null);
        }

        ImageView dailyimg = view.findViewById(R.id.daily_image);
        TextView dailytext = view.findViewById(R.id.daily_text);

        dailyimg.setImageResource(arrdailyimg[position]);
        dailytext.setText(arrdailytext[position]);

        return view;
    }
}
