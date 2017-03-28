# Android-ColorTrackView
字体或者图片可以逐渐染色和逐渐褪色的动画效果

# 使用

```xml
 <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" >

    <com.example.colortrackviewlib.view.PagerSlidingTabStrip
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:background="#fff"
        android:visibility="visible"
        app:pstsIndicatorColor="#f4e033"
        app:pstsDividerColor="#00000000"
        app:pstsIndicatorHeight="4dp"
        app:pstsShouldExpand="false"
        app:pstsTextAllCaps="false"
        app:pstsColorTrackChangeColor="@color/colorAccent"
        app:pstsColorTrackOriginColor="@color/colorPrimary"
        app:psts_text_size="18sp"
        />

    <android.support.v4.view.ViewPager
        android:id="@+id/id_viewpager"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" >
    </android.support.v4.view.ViewPager>

 </LinearLayout>
		
```Activity中
	
	BooKPagerAdapter adapter = new BooKPagerAdapter(getSupportFragmentManager(), mTitles);
		mViewPager.setAdapter(adapter);
		tabs.setViewPager(mViewPager);
		mViewPager.setCurrentItem(0);
```

注：其中的ColorTrackView就是文字的渐变效果属性如下

* `progress`  [0.0f , 1.0f]
* `text` 绘制的文本
* `text_change_color`目标颜色
* `text_origin_color`原始颜色
* `text_size`字体大小
* `direction `方向，枚举类型，支持：left,right,top,bottom

# 效果图

## 简单使用
![](sample_ColorTrackeView/sc.gif)

## 结合ViewPager
![](sample_ColorTrackeView/changecolortvdemo.gif)


# 特别感谢
[原来的控件](http://blog.csdn.net/lmj623565791)
[张林](https://github.com/zhanglinlovejava/TrackColorTab)


