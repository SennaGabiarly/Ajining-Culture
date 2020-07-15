package com.sennagby.coba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sennagby.coba.fragment.Menu1.HomeFragment;
import com.sennagby.coba.fragment.Menu3.Home3Fragment;
import com.sennagby.coba.fragment.Menu2.Home2Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selected = null;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    selected = new HomeFragment();
                    break;
                case R.id.nav_home2:
                    selected = new Home2Fragment();
                    break;
                case R.id.nav_home3:
                    selected = new Home3Fragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selected).commit();
            return true;
        }
    };
}
