package com.example.newmedia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class history1 extends AppCompatActivity {
    ListView listview; // Declare your ListView


    ArrayList<String> datetext = new ArrayList<>();
    ArrayList<String> dailytext = new ArrayList<>();
    ArrayList<Integer> dailyimg = new ArrayList<>();
    ArrayList<String> timetext = new ArrayList<>();
    /*
    String[] dailytext = {"I", "sample", "sample", "sample", "sample", "sample", "sample", "sample"};
    int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};
    String[] timetext = {"sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample AM", "sample PM"};

     */

    String story = findViewById(R.id.storyedittext).toString();
    @SuppressLint("WrongViewCast")
    Button checkButton = findViewById(R.id.CheckButton);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history1);
        listview = findViewById(R.id.listview);
        if (datetext.size() == 0) {
            listview.getEmptyView();
        }
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    datetext.add(giveListViewInfo.getDate());
                }
                dailytext.add(story);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    timetext.add(giveListViewInfo.getTime());
                }
            }
        });
        listadapter finallistadapter = new listadapter(history1.this, datetext, dailytext, dailyimg, timetext);
        listview.setAdapter(finallistadapter);
    }
}