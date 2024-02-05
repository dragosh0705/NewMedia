package com.example.newmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String plant = findViewById(R.id.PlantNickName).toString();
        String fish = findViewById(R.id.FishNickName).toString();
        Button button = findViewById(R.id.startButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!plant.isEmpty() || !fish.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, homepage.class);
                    startActivity(intent);
                }
            }
        });
    }
}