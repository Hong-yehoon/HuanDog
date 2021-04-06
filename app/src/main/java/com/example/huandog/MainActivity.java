package com.example.huandog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Fragment fragmentHome;
    Fragment fragmentFriends;
    Fragment fragmentMyPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentHome = new HomeFragment();
        fragmentFriends = new FriendsFragment();
        fragmentMyPage = new MyPageFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_main,fragmentHome).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.navigation_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_main,fragmentHome).commit();
                        return true;

                    case R.id.navigation_friends:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_main,fragmentFriends).commit();
                        return true;

                    case R.id.navigation_myPage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_activity_main,fragmentMyPage).commit();
                        return true;
                }

                return false;
            }
        });

    }
}