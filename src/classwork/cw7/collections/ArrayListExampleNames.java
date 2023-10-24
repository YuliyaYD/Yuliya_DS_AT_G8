package classwork.cw7.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleNames {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String n : names) {
            System.out.print(n + " ");
        }

        names.set(1, "Оля");
        names.set(3, "Катя");
        System.out.println(names);

        for (int i = 0;i < names.size();i++ ) {
            System.out.print(names.get(i) + " ");
        }

        names.remove("Оля");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        for (String n : names) {
            System.out.print(n + " ");
        }

    }
}