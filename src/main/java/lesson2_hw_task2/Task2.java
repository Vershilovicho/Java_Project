package lesson2_hw_task2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

//2. Напишите метод, который составит строку,
//        состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.


    public static void main(String[] args) {
        writeString(repeatString("TEST"));
    }

    public static String repeatString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static void writeString(String string) {
        try (FileWriter file = new FileWriter("test.txt")) {
            file.append(string);
            System.out.println("Файл успешно создан");

        } catch (IOException ex) {
            System.err.println("Ошибка :" + ex);
        }
    }
}

