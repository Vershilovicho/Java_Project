package lesson4_hw;
//2. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
public class Task02 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(20);
        linkedList.add(11);
        System.out.println("Исходный LinkedList: " + linkedList);
        LinkedList<Integer> revlinkedList = new LinkedList<>();
        revlinkedList = reverseLinkedList(linkedList);
        System.out.println("Перевернутый LinkedList: " + revlinkedList);
    }

    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revLinkedList.add(linkedList.get(i));
        }
        return revLinkedList;
    }
}
