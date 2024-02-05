package com.example.newmedia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listinlist_listview_adapt extends AppCompatActivity {
    ListView listview;

    String[] dailytext = {"sample", "sample", "sample", "sample", "sample"};
    int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};
    String[] timetext = {"2023.12.03", "2023.12.07", "2023.12.10", "2023.12.13", "2023.12.15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history1);

        listinlistadapter listinlistadapter = new listinlistadapter(listinlist_listview_adapt.this, dailytext, dailyimg, timetext);
        listview.setAdapter(listinlistadapter);
    }
}
