package com.example.madmovegame.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class IntroViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();

    public IntroViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment){

        fragmentList.add(fragment);
    }

    @Override
    public Fragment getItem(int i) {

        return fragmentList.get(i);

    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


}
