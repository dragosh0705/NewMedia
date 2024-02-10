package com.example.newmedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class gridview_adapter extends BaseAdapter {

    private Context context;
    private int[] dailyimg;
    private String[] timetext;
    private LayoutInflater inflater;
    private String[] dailytext;



    public gridview_adapter(Context context, String[] dailytext, int[] dailyimg, String[] timetext) {
        this.context = context;
        this.dailytext = dailytext;
        this.dailyimg = dailyimg;
        this.timetext = timetext;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dailytext.length;
    }

    @Override
    public Object getItem(int position) {
        return dailytext[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(R.layout.daily_grid_layout, viewGroup, false);
            TextView story = (TextView) view.findViewById(R.id.daily_text);
            ImageView storyimg = (ImageView) view.findViewById(R.id.daily_image);
            TextView storydate = (TextView) view.findViewById(R.id.daily_date);

            story.setText(dailytext[position]);
            storyimg.setImageResource(dailyimg[position]);
            storydate.setText(timetext[position]);

        }
        return view;
    }
}
