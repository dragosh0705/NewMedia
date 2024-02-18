package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listadapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> dailystory;
    private ArrayList<Integer> dailyimg;
    private ArrayList<String> timetext;
    private LayoutInflater inflater;
    private ArrayList<String> datetext;



    public listadapter(Context context, ArrayList<String> datetext, ArrayList<String> dailystory, ArrayList<Integer> dailyimg, ArrayList<String> timetext) {
        this.context = context;
        this.dailystory = dailystory;
        this.dailyimg = dailyimg;
        this.timetext = timetext;
        this.datetext = datetext;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dailystory.size();
    }

    @Override
    public Object getItem(int position) {
        return dailystory.get(position);
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

            date.setText(datetext.get(position));
            story.setText(dailystory.get(position));
            storyimg.setImageResource(dailyimg.get(position));
            storytime.setText(timetext.get(position));



        return convertView;
    }

}