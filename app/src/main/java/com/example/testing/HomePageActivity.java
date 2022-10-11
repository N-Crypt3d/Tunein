package com.example.testing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePageActivity extends AppCompatActivity{
    BottomNavigationView home_page_bottom_navigation_view;
    MusicFragment musicFragment = new MusicFragment();
    FriendsFragment friendsFragment = new FriendsFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    public static Context contextOfApplication = getContextOfApplication();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        home_page_bottom_navigation_view = findViewById(R.id.home_page_bottom_navigation_view_id);

        getSupportFragmentManager().beginTransaction().replace(R.id.home_page_frame_layout_id, musicFragment).commit();

        home_page_bottom_navigation_view.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.music_icon_id:
                        getSupportFragmentManager().beginTransaction().replace(R.id.home_page_frame_layout_id, musicFragment).commit();
                        return true;
                    case R.id.friends_icon_id:
                        getSupportFragmentManager().beginTransaction().replace(R.id.home_page_frame_layout_id, friendsFragment).commit();
                        return true;
                    case R.id.account_icon_id:
                        getSupportFragmentManager().beginTransaction().replace(R.id.home_page_frame_layout_id, profileFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }

    public static Context getContextOfApplication()
    {
        return contextOfApplication;
    }
}