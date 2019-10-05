package com.example.doublenavigationdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class OneFmAdapter extends FragmentPagerAdapter {

    private List<Fragment> fmList;
    private FragmentManager fm;

    public OneFmAdapter(FragmentManager fm,List<Fragment> fmList) {
        super(fm);
        this.fm = fm;
        this.fmList = fmList;
    }

    @Override
    public Fragment getItem(int arg0) {
        return fmList.get(arg0%fmList.size());
    }

    @Override
    public int getCount() {
        return fmList.size();
    }
    @Override
    public int getItemPosition(Object object) {
        //没有找到child  要求重新加载
        return POSITION_NONE;
    }
}
