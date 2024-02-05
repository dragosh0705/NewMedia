package com.example.newmedia;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class history1 extends AppCompatActivity {
    ListView listview;

    String[] datetext = {"2023.12.03", "2023.12.07", "2023.12.10", "2023.12.13", "2023.12.15"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history2);

        listadapter listadapter = new listadapter(history1.this, datetext);
        listview.setAdapter(listadapter);
    }
}
