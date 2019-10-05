package com.example.doublenavigationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class MainActivity extends FragmentActivity implements OnTabChangeListener {

    private FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //初始化FragmentTabHost
        initHost();
        //初始化底部导航栏
        initTab();
        //默认选中
        mTabHost.onTabChanged(TabDb.getTabsTxt()[0]); //从分割线中获得多少个切换界面
    }

    private void initTab() {
        String[] tabs = TabDb.getTabsTxt();
        for (int i = 0; i < tabs.length; i++) {
            //新建TabSpec
            TabSpec tabSpec = mTabHost.newTabSpec(TabDb.getTabsTxt()[i]);
            //设置view
            View view = LayoutInflater.from(this).inflate(R.layout.tab_foot, null);     //改
            ((TextView) view.findViewById(R.id.foot_tv)).setText(TabDb.getTabsTxt()[i]);
            ((ImageView) view.findViewById(R.id.foot_iv)).setImageResource(TabDb.getTabsImg()[i]);
            tabSpec.setIndicator(view);
            //加入TabSpec
            mTabHost.addTab(tabSpec,TabDb.getFramgent()[i],null);
        }
    }
    /***
     * 初始化Host
     */
    private void initHost() {
        mTabHost = (FragmentTabHost) findViewById(R.id.main_tab);
        //调用setup方法 设置view
        mTabHost.setup(this, getSupportFragmentManager(),R.id.main_view);
        //去除分割线
        mTabHost.getTabWidget().setDividerDrawable(null);   //效果未知
        //监听事件
        mTabHost.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String arg0) {
        //从分割线中获得多少个切换界面
        TabWidget tabw = mTabHost.getTabWidget();
        for (int i = 0; i < tabw.getChildCount(); i++) {
            View v = tabw.getChildAt(i);
            TextView tv = (TextView) v.findViewById(R.id.foot_tv);
            ImageView iv = (ImageView) v.findViewById(R.id.foot_iv);
            //修改当前的界面按钮颜色图片
            if (i == mTabHost.getCurrentTab()) {
                tv.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                iv.setImageResource(TabDb.getTabsImgLight()[i]);
            }else{
                tv.setTextColor(getResources().getColor(R.color.colorPrimary));
                iv.setImageResource(TabDb.getTabsImg()[i]);
            }
        }
    }
}
