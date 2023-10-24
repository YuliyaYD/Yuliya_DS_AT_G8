package classwork.cw7.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        System.out.println("first word is:" + words.get(0));
        words.remove(0);
        System.out.println("first word after remove is: " + words.get(0));
    }
}