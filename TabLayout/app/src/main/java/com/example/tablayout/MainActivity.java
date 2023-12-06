package com.example.tablayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tl1;
    ViewPager2 vp2;
    FragmentAdepter fa;

    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tl1=(TabLayout) findViewById(R.id.tl);
        vp2=(ViewPager2) findViewById(R.id.vp);

        fa=new FragmentAdepter(this);
        vp2.setAdapter(fa);


//        ab=getSupportActionBar();
//        ab.setIcon(R.drawable.baseline_30fps_24);
//        ab.setLogo(R.drawable.baseline_bluetooth_24);
//        ab.setDisplayShowHomeEnabled(true);
//        ab.setDisplayUseLogoEnabled(true);
//
//        ab.setTitle("My App");
//        ab.setSubtitle("Whatsapp");


        tl1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }
        });

        vp2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tl1.getTabAt(position).select();
            }
        });
    }
}