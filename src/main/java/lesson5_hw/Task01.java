package lesson5_hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class Task01 {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        addInPhoneBook("Кузнецов", "+7(555)111-11-11", phoneBook);
        addInPhoneBook("Петров", "+7(444)111-11-11", phoneBook);
        addInPhoneBook("Иванов", "+7(333)111-11-11", phoneBook);
        addInPhoneBook("Сидоров", "+7(950)111-11-11", phoneBook);
        addInPhoneBook("Сафонова", "+7(111)111-11-11", phoneBook);
        addInPhoneBook("Сафонова", "+7(222)111-11-11", phoneBook);
        printBook(phoneBook);
    }

    private static void addInPhoneBook(String key, String value, Map<String, ArrayList<String>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(String.valueOf(value));
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(value);
            map.put(key, arrayList);
        }
    }

    public static void printBook(Map<String, ArrayList<String>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (String el : item.getValue()) {
                phones = phones + el + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }


}
