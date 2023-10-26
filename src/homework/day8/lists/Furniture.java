package homework.day8.lists;

import homework.day8.precondition.Chair;
import homework.day8.precondition.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Furniture {
    public static void main(String[] args) {
        List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        //Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
        for (Chair chair : chairs) {
            System.out.print("Произведение высоты на ширину:" + chair.getHeight() * chair.getWidth() + " ");
        }
        System.out.println(" ");
        System.out.println("***************************************************");

        //Создать пустую карту, где ключом является целое число, а значением объект стула
        Map<Integer, Chair> chairMap = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        chairMap.put(1, new Chair(1, 2));
        chairMap.put(2, new Chair(4, 2));
        chairMap.put(3, new Chair(2, 4));

        //Проитерировать карту и отпечатать ключи в консоль
        for (Integer i : chairMap.keySet()) {
            System.out.println(i);
        }
        System.out.println("***************************************************");

        //Проитерировать карту и отпечатать значения в консоль
        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }
        System.out.println("***************************************************");

        //Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + "; Значение: " + entry.getValue());
        }
    }
}