package com.example.doublenavigationdemo;
import com.example.doublenavigationdemo.Fragment.*;

public class TabDb {
    /***
     * 获得底部所有项
     */
    public static String[] getTabsTxt() {
        String[] tabs = {"首页","交易","地点","我的"};
        return tabs;
    }
    /***
     * 获得所有碎片
     */
    public static Class[] getFramgent(){
        Class[] cls = {OneFm.class,TwoFm.class,ThreeFm.class,FourFm.class};
        return cls ;
    }
    /***
     * 获得所有点击前的图片
     */
    public static int[] getTabsImg(){
        int[] img = {R.drawable.alipay,R.drawable.bill,R.drawable.fire,R.drawable.friends};
        return img ;
    }
    /***
     * 获得所有点击后的图片
     */
    public static int[] getTabsImgLight(){
        int[] img = {R.drawable.gift,R.drawable.hot_sale,R.drawable.search,R.drawable.send_gift};
        return img ;
    }
}
