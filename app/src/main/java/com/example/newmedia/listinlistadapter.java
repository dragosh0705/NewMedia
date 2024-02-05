package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class listinlistadapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    String[] arrdailytext;
    int[] arrdailyimg;
    String[] arrtimetext;

    public listinlistadapter(Context context, String[] arrdailytext, int[] arrdailyimg, String[] arrtimetext) {

        this.context= context;
        this.arrdailytext = arrdailytext;
        this.arrdailyimg = arrdailyimg;
        this.arrtimetext = arrdailytext;
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
            view = inflater.inflate(R.layout.listinlist, null);
        }

        ImageView dailyimg = view.findViewById(R.id.listviewimg);
        TextView dailytext = view.findViewById(R.id.dailystory);
        TextView timetext = view.findViewById(R.id.time);

        dailyimg.setImageResource(arrdailyimg[position]);
        dailytext.setText(arrdailytext[position]);
        timetext.setText(arrtimetext[position]);

        return view;
    }
}
