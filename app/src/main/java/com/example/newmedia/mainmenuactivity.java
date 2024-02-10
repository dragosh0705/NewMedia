package com.example.newmedia;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

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

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }

    class ItemSelectedListner implements NavigationBarView.OnItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(item.getItemId()){
                case R.id.Home:
                    transaction.replace(R.id.bottomNavigationView, home).commitAllowingStateLoss();
                    break;
                case R.id.History:
                        transaction.replace(R.id.bottomNavigationView, history).commitAllowingStateLoss();
                        break;
            }
            return true;
        }


    }
}
