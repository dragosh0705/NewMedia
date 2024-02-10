package com.example.newmedia;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class mainmenuactivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private homebottomnavi home = new homebottomnavi();
    private historybottomnavi history = new historybottomnavi();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new ItemSelectedListner());

        // Set the default fragment
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.Home, home).commit();
    }

    class ItemSelectedListner implements NavigationBarView.OnItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.Home:
                    transaction.replace(R.id.Home, home).commit();
                    return true;
                case R.id.History:
                    transaction.replace(R.id.History, history).commit();
                    return true;
            }
            return false;
        }
    }
}
