package com.company.CollectionsMy;

import java.util.*;

public class FourthLessonHashCode {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
//        Map<Person, String> map = new HashMap<>();
//        Set<Person> set = new HashSet<>();
//        set.add("Hello");
//        set.add("Hello");
//        Integer x = 1;
//        System.out.println(x.equals(1));
//        map.put(1, "one");
//        map.put(1, "two");//перезапишет значение
//
//        set.add(1);
//        set.add(1);//добавиться одно значение
//
//        System.out.println(map);
//        System.out.println(set);

//        Person person1 = new Person(2, "Mike");
//        Person person2 = new Person(1, "Mike");
//        set.add(person1);
//        set.add(person2);
//        map.put(person1, "123");
//        map.put(person2, "123");
//        System.out.println(map);
//        System.out.println(set);
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id = " + id + " name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}