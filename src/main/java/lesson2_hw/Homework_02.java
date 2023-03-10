//1. Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом
// (возвращает boolean значение).
//

package lesson2_hw;
public class Homework_02 {
    public static void main(String[] args) {
        System.out.println(palindrome("топот"));
        }

    public static boolean palindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}






