package com.example.newmedia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class history1 extends AppCompatActivity {
    ListView listview; // Declare your ListView


    String[] datetext = {"2023.12.03", "2023.12.07", "2023.12.10", "2023.12.13", "2023.12.15", "2023.12.20", "2023.12.30", "2023.12.31", "2024.01.01"};
    String[] dailytext = {"I", "sample", "sample", "sample", "sample", "sample", "sample", "sample"};
    int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};
    String[] timetext = {"sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample PM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history1);
        listview = findViewById(R.id.dailylistview);
        listadapter finallistadapter = new listadapter(history1.this, datetext, dailytext, dailyimg, timetext);
        listview.setAdapter(finallistadapter);
    }
}
