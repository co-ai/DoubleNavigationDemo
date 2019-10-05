package com.example.doublenavigationdemo;

import java.util.ArrayList;
import java.util.List;

//顶部导航栏标题
public class HTabDb {
    private static final List<HTab> Selected = new ArrayList<HTab>();
    static{
        Selected.add(new HTab("今日"));
        Selected.add(new HTab("头条"));
        Selected.add(new HTab("娱乐"));
        Selected.add(new HTab("财经"));
        Selected.add(new HTab("军事"));
        Selected.add(new HTab("科技"));
        Selected.add(new HTab("时尚"));
        Selected.add(new HTab("体育"));
    }
    /***
     * 获得头部tab的所有项
     */
    public static List<HTab> getSelected() {
        return Selected;
    }

}
