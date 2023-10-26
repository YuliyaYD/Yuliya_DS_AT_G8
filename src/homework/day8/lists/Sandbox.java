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
        System.out.println("**************************************");

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("**************************************");

        //Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> sandMap = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве
        // ключа любое уникальное число
        sandMap.put(1, new Sand(2, "Речной"));
        sandMap.put(2, new Sand(4, "Речной"));
        sandMap.put(3, new Sand(2, "Карьерный"));
        sandMap.put(4, new Sand(7, "Речной"));

        //Проитерировать карту и отпечатать ключи в консоль
        for (Integer i : sandMap.keySet()) {
            System.out.println(i);
        }
        System.out.println("**************************************");

        //Проитерировать карту и отпечатать значения в консоль
        for (Sand sand : sandMap.values()) {
            System.out.println(sand);
        }
        System.out.println("**************************************");

        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + "; Значение: " + entry.getValue());
        }
    }
}