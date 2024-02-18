package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import org.w3c.dom.Text;

public class listadapter extends BaseAdapter {
    private Context context;
    private String[] dailytext;
    private int[] dailyimg;
    private String[] timetext;
    private LayoutInflater inflater;
    private String[] datetext;



    public listadapter(Context context, String[] datetext, String[] dailytext, int[] dailyimg, String[] timetext) {
        this.context = context;
        this.dailytext = dailytext;
        this.dailyimg = dailyimg;
        this.timetext = timetext;
        this.datetext = datetext;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dailytext.length;
    }

    @Override
    public Object getItem(int position) {
        return datetext[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            convertView = inflater.inflate(R.layout.daily_list_layout, parent, false);
            TextView date = (TextView) convertView.findViewById(R.id.date);
            TextView story = (TextView) convertView.findViewById(R.id.dailystory);
            ImageView storyimg = (ImageView) convertView.findViewById(R.id.listviewimg);
            TextView storytime = (TextView) convertView.findViewById(R.id.time);

            date.setText(datetext[position]);
            story.setText(dailytext[position]);
            storyimg.setImageResource(dailyimg[position]);
            storytime.setText(timetext[position]);



        return convertView;
    }

}