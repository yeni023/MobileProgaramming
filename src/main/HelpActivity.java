package com.example.school;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class HelpActivity extends AppCompatActivity {
    Toolbar toolbar;
    HelpLockerFragment helpLockerFragment;
    HelpLibraryFragment helpLibraryFragment;
    HelpRentalFragment helpRentalFragment;
    HelpRestaurantFragment helpRestaurantFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Toolbar toolbar = findViewById(R.id.toolbar_help);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        helpLockerFragment = new HelpLockerFragment();
        helpLibraryFragment = new HelpLibraryFragment();
        helpRentalFragment = new HelpRentalFragment();
        helpRestaurantFragment = new HelpRestaurantFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container2, helpLockerFragment).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation2);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            
            // 도움말 액티비티의 하단 바의 각 버튼을 누르면 해당 프레그먼트로 화면 전환
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.itmlocker:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, helpLockerFragment).commit();
                        return true;
                    case R.id.itmlibrary:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, helpLibraryFragment).commit();
                        return true;
                    case R.id.itmrestaurant:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, helpRestaurantFragment).commit();
                        return true;
                    case R.id.itmrental:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container2, helpRentalFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}
