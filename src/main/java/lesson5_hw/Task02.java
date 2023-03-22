package lesson5_hw;
//2. Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Мария Рыкова
//Марина Лугова
//Анна Владимирова
//Иван Мечников
//Петр Петин
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Map<String, Integer> nameHashMap = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        String[] listOfEmployees = employees.split(" ");
        for (int i = 0; i < listOfEmployees.length; i += 2) {
            if (nameHashMap.containsKey(listOfEmployees[i])) {
                nameHashMap.replace(listOfEmployees[i], nameHashMap.get(listOfEmployees[i]) + 1);
            } else {
                nameHashMap.put(listOfEmployees[i], 1);
            }
        }
        System.out.println(nameHashMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameHashMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameHashMap.entrySet()) {
                String key = entry.getKey();
                if (nameHashMap.get(key) == i) {
                    sortedNameMap.put(key, nameHashMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}


