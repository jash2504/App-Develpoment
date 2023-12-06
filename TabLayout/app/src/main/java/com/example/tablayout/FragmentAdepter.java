package com.example.tablayout;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout.fragment.CallFragment;
import com.example.tablayout.fragment.ContectFragment;
import com.example.tablayout.fragment.HomeFragment;

public class FragmentAdepter extends FragmentStateAdapter {

    public FragmentAdepter(@NonNull FragmentActivity fragmentActivity) {

        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch(position)
        {

            case 0:
                    return  new CallFragment();

            case 1:
                    return  new HomeFragment();

            case 2:
                 return  new ContectFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
