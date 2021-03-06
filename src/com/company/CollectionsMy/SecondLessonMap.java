package com.company.CollectionsMy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SecondLessonMap {
    //может быть только однин ключ в мапе
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();//не гарантирует никакого порядка элементов

        Map<Integer, String> linkedMap = new LinkedHashMap<>();//гарантирует порядок добавления элементов

        Map<Integer, String> treeMap = new TreeMap<>();//будут отсортированы по ключу
//        testMap(hashMap);
//        testMap(linkedMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
//не гарантирует последовательность объектов