package com.example.tbdapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.tbdapp.R;
import com.example.tbdapp.models.Advisor;
import com.example.tbdapp.fragments.ContactsFragment;
import com.example.tbdapp.fragments.ExploreFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;

    private static final String TAG = "MyActivity";
    private ArrayList<Advisor> advisorList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAdvisorProfiles();

        setupTabLayout();
        loadFragment(0); //load fragment for first tab layout item


        //TEMP: video activity
        Intent intent = new Intent(this, VideoCallActivity.class);
        startActivity(intent);
    }

    private void loadContactsFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, new ContactsFragment(advisorList));
        ft.commit();
    }

    private void loadExploreFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, new ExploreFragment(advisorList));
        ft.commit();
    }

    private void loadProfileFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    }

    private void loadFragment(int position) {
        switch (position) {
            case 0: //position of first tab bar item (explore screen)
                loadExploreFragment();
                break;
            case 1: //position of second tab bar item (contacts screen)
                loadContactsFragment();
                break;
            case 2: //position of third tab bar item (profile screen)
                loadProfileFragment();
                break;
        }
    }

    private void setupTabLayout() {
        mTabLayout = findViewById(R.id.tabLayout);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d(TAG, "TabLayout Tab selected: " + position);
                loadFragment(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void createAdvisorProfiles() {
        advisorList.add(new Advisor("Brittany Williams", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, true));
        advisorList.add(new Advisor("Thomas Edwards", "Career", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, true));
        advisorList.add(new Advisor("Daniel Wilson", "Career", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Jaimie Miller", "Career", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Raiqah Johal", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Chris Peacock", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("George London", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Alexei Dubrivonich", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, true));
        advisorList.add(new Advisor("Aetherbald the Great", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Pyńęł Rziąćic", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Cornelius II of Rome", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Rünerig Pfochmännördt", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        advisorList.add(new Advisor("Grzegorz Brzęczyszczykiewicz", "Financial", getString(R.string.placeholderText), getString(R.string.placeholderText), R.drawable.ic_face, false));
        
    }
}
