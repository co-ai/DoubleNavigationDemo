package com.example.doublenavigationdemo;

/***
 * 头部Tab属性
 *
 */
public class HTab {

    private String name;        //顶部导航栏标签页名字

    public HTab(String name) {
        super();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
