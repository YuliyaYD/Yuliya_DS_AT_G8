package classwork.cw7.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");

        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);
        }

        for (int i : words.keySet()) {
            System.out.println(i);
        }

        System.out.println("_______________________");

        for (String j : words.values()) {
            System.out.println(j);
        }

        System.out.println("*******************************************");

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());

        }
    }
}