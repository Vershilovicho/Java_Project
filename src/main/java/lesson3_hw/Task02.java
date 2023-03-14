package lesson3_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;


//2. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task02 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            arrayList.add(val);
        }
        System.out.printf("Первоначальный список: %s\n", arrayList);
        System.out.printf("Максимальный элемент: %s\n", Collections.max(arrayList));
        System.out.printf("Минимальный элемент: %s\n", Collections.min(arrayList));
        int sumItems = 0;
        for (int item : arrayList) {
            sumItems += item;
        }
        float average = (float)sumItems/arrayList.size();
        System.out.printf("Среднее арифметическое: %s\n", average);
    }
}




