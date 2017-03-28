package com.example.caizhili.mycolortrackview.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.caizhili.mycolortrackview.activity.TabFragment;


/**
 * Created by Colin.Zhang on 2017/1/19.
 */
public class BooKPagerAdapter extends FragmentStatePagerAdapter {
    private String[] catList;

    public BooKPagerAdapter(FragmentManager fragmentManager,String[] catList) {
        super(fragmentManager);
        this.catList = catList;
    }

    @Override
    public int getCount() {
        return catList.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return catList[position];
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(catList[position]);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
