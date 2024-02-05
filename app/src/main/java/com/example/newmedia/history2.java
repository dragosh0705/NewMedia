package com.example.newmedia;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class history2 extends AppCompatActivity {

    GridView gridView;

    String[] dailytext = {"sample", "sample", "sample", "sample", "sample"};
    int[] dailyimg = {R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img, R.drawable.sample_img};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history2);

        gridview_adapter gridadater = new gridview_adapter(history2.this, dailytext, dailyimg);
        gridView.setAdapter(gridadater);
    }

}
