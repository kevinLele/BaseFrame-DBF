package com.hq.dbf.BaseDomain.entity;

/**
 * Created by Administrator on 7/27/2017.
 */
public class HelloWorld extends BaseEntity {

    private String name;

    private int age;

    private boolean isMan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
