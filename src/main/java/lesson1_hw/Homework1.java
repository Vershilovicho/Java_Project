package lesson1_hw;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
    1. Задать одномерный массив и найти в нем минимальный и максимальный элементы.
*/
public class Homework1 {
    public static void main(String[] args) {
//        int [] arr = { 3, 10, 5, 3, 0, -11, 8 };
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] ans = moveElInTheEnd(nums, val);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        //findMin(arr);
        //findMax(arr);
        inputName();
    }


    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
    }

    private static void findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }


//2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.

    private static int[] moveElInTheEnd(int[] arr, int num) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[j] == num) {
                j--;
            }
            if (arr[i] == num) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        return arr;
    }

//
//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


    private static void inputName() {
        LocalDateTime now = LocalDateTime.now();
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(now);
        System.out.println("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}