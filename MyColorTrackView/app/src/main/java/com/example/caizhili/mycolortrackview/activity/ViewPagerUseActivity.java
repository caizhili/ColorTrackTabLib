package com.example.caizhili.mycolortrackview.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.caizhili.mycolortrackview.adapter.BooKPagerAdapter;
import com.example.colortrackviewlib.view.PagerSlidingTabStrip;
import com.zhy.viewpagerIndicator.R;


public class ViewPagerUseActivity extends FragmentActivity
{
	private String[] mTitles = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
	private ViewPager mViewPager;
	PagerSlidingTabStrip tabs;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vp_main);

		initViews();
		initDatas();
	}

	private void initDatas()
	{
		BooKPagerAdapter adapter = new BooKPagerAdapter(getSupportFragmentManager(), mTitles);//		for (int i = 0; i < mTitles.length; i++)
		mViewPager.setAdapter(adapter);
		tabs.setViewPager(mViewPager);
		mViewPager.setCurrentItem(0);
	}

	private void initViews()
	{
		mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
		tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
	}

}
