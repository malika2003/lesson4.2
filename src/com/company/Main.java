package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Айбек");
        names.add("Нурбек");
        names.add("Кунбек");
        System.out.println(names);
        names.remove("Нурбек");
        names.clear();
        System.out.println(names);
        names.add("Айбек");
        names.add("Нурбек");
        names.add("Кунбек");
        System.out.println(names);
        if (names.isEmpty()){
            System.out.println("Список пустой");
        }else {
            System.out.println("Список не пустой");
        }
        if (names.contains("Айбек")){
            System.out.println("Да" + names.get(0));
        }else {
            System.out.println("Нет");
        }
        System.out.println("Список 1 " + names);
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Амина");
        names2.add("Малика");
        names2.add("Нурайым");
        System.out.println("Список2 " +names2);

        names.addAll(names2);
        System.out.println("Список1 " + names);
        names.removeAll(names2);
        System.out.println("Список1 " + names);
        names.retainAll(names2);
        System.out.println("Список1 " + names2);
        System.out.println("Список2 " + names);

        System.out.println("Размер списка1 = " + names.size());

        System.out.println("-------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for ( String name: names) {
            System.out.println(name);
        }
        System.out.println("список1 " + names);
        System.out.println("Индекс" + names.indexOf("Нурбек"));

        LinkedList<Integer> numbers = new LinkedList<>();
        System.out.println(numbers);
        numbers.add(2332);
        numbers.add(2652);
        numbers.add(2302);
        System.out.println(numbers);
        System.out.println("-------------------");

        User user = new User(18, "malika");
        User user2 = new User(40, "nur");
        User user3 = new User(20, "Jhon");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        System.out.println(users);

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1234);
        numbersList.add(-124);
        numbersList.add(134);
        System.out.println(numbersList);
        Collections.sort(numbersList);
        System.out.println(numbersList);
        Collections.reverse(numbersList);
        System.out.println(numbersList);
        Collections.shuffle(numbersList);
        System.out.println(numbersList);





    }
}
