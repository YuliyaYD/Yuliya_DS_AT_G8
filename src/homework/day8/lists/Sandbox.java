package homework.day8.lists;

import homework.day8.precondition.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        //Проитерировать список через for-each и отпечатать вес в консоль через пробел
        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println(" ");
        System.out.println("_____________________________________________");

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("_____________________________________________");

        //Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Заполнить карту значениями из предыдущего списка, используя в качестве
        // ключа любое уникальное число





    }
}
