package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChildOne {

    int id;
    int age;
    String name;

    public ChildOne() {

    }

    public ChildOne(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public List<ChildOne> getChildList() {
        List<ChildOne> childList = new ArrayList<>();

        childList.add(new ChildOne(1, 10, "Teddi"));
        childList.add(new ChildOne(2, 12, "Alto"));
        childList.add(new ChildOne(3, 15, "Zaini"));
        childList.add(new ChildOne(4, 18, "Mohsni"));
        childList.add(new ChildOne(5, 20, "Sain"));

        return childList;
    }
}
