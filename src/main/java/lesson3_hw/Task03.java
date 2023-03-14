package lesson3_hw;

import java.util.ArrayList;
import java.util.List;

//3. Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.
public class Task03 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add(String.valueOf(85));
        arrayList.add(String.valueOf(5));
        arrayList.add(String.valueOf(78));
        arrayList.add(String.valueOf(98));
        arrayList.add("hi");
        arrayList.add("hel");
        System.out.printf("Первоначальный список: %s\n", arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            int n = 0;
            try {
                n = Integer.parseInt(arrayList.get(i));
                arrayList.remove(i);
                i--;
            } catch (NumberFormatException e) {
                System.out.println("Это было не число");
            }
        }
        System.out.printf("Итоговый список: %s\n", arrayList);
    }
}






