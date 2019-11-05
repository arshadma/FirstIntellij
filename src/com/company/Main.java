package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

       // Main.collectionTestScenario();
        Main.streamsTestScenario();
    }

    /**
     * method created to check the behaviour of java collections...
     */
    private static void collectionTestScenario() {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println("Printing List: " + list);

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println("Print Map: " + map);

        System.out.println("Print Map using loop . . . ");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    /**
     * test function to learn streams functionality provided in JAVA 8 . . .
     */
    private static void streamsTestScenario() {

        List<ChildOne> childList = new ChildOne().getChildList();

        childList.stream().filter(p->p.age>10).forEach(p->System.out.println(p.name));
    }
}
