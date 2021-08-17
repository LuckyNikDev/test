package com.company.CollectionsMy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThirdLessonSet {
    //хранит только уникальные элементы
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        //не гарантирует порядка элементов
        Set<String> linkedSet = new LinkedHashSet<>();
        //сохраняется порядок ввода
        Set<String> treeSet = new TreeSet<>();
        //элементы будут отсортированы

        //методы
        hashSet.add("tom");
        hashSet.add("tom");
        hashSet.add("tom");
        hashSet.contains("tom");//проверяет наличие элемента
        hashSet.isEmpty();//проверяет пустая ли коллекция
        System.out.println(hashSet);
    }
}
