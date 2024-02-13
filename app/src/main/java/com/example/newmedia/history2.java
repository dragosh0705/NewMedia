package com.example.newmedia;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class history2 extends AppCompatActivity {

    GridView gridView;


    String[] dailytext = {"sample1", "sample", "sample", "sample", "sample", "sample", "sample", "sample", "sample9"};
    int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};
    String[] timetext = {"sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample PM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history2);
        gridView = findViewById(R.id.dailygridview);
        gridview_adapter gridadapter = new gridview_adapter(history2.this, dailytext, dailyimg, timetext);
        gridView.setAdapter(gridadapter);
    }

}
