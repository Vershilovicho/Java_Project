package lesson4_hw;
//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf(
                    "\n- Введите строку для добавления в список;\n" +
                            "- введите print для просмотра уже введённого списка\n" +
                            "- введите revert, если хотите удалить последнюю введенную строку\n" +
                            "- введите stop, чтобы выйти\n" +
                            "Введите ваш выбор: ");
            String inputString = sc.nextLine();
            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputString.equals("stop")) {
                break;
            }

            if (inputString.equals("print")) {
                System.out.println(inputLinkedList);
            } else if (inputString.equals("revert")) {
                inputLinkedList.removeFirst();
                System.out.println(inputLinkedList);
            } else {
                inputLinkedList.addFirst(inputString);
            }
        }
        sc.close();
    }
}
