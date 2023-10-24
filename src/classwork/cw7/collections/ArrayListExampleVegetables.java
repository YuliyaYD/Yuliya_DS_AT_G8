package classwork.cw7.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleVegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String v : vegetables) {
            System.out.print(v + " ");
        }

        int count = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                count++;
            }
        }
        System.out.println(count);




    }
}
