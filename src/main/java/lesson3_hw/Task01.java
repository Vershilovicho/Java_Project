package lesson3_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел,
// удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Task01 {
    public static void main(String[] args) {
        removeEvenNumbers();
    }

    private static void removeEvenNumbers() {
        Random rnd = new Random();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            arrayList.add(val);
        }
        System.out.println(arrayList);
        arrayList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
