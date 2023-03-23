package lesson6;
//1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
//        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
//        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.

//1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000.
//2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//   Для вычисления процента используйте формулу:
//   процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.



import java.util.*;

public class Task01 {
    public static void main(String[] args) {
            ex1();
        }

        private static void ex0() {

//        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять", "Десять");
            List<?> data = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
            var dataNew = new ArrayList<>(data);
            Collections.reverse(dataNew);

            System.out.println(new HashSet<>(dataNew));
            System.out.println(new LinkedHashSet<>(dataNew));
            System.out.println(new TreeSet<>(dataNew));
        }

        private static void ex1() {
            final int ARRAY_SIZE = 100000;
            Integer[] arr =  new Integer[ARRAY_SIZE];
            Random random = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(1, ARRAY_SIZE + 1);
            }

            HashSet<Integer> uniq = new HashSet<>(Arrays.asList(arr));

            double n = uniq.size() * 100 / arr.length;
            System.out.printf("%.2f%n", 1.0 * uniq.size() * 100 / arr.length);
            System.out.println(n);
            System.out.println((double) uniq.size() * 100 / arr.length);

        }
}



