package classwork.cw7.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedLists {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("мама");
        }
        System.out.println("ArrayList:" + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("мама");
        }
        System.out.println("LinkedList:" + (System.currentTimeMillis() - t0));
    }
}