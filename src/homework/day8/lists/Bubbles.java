package homework.day8.lists;

import homework.day8.precondition.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubbles {
    public static void main(String[] args) {
        //Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO)
        // соответственно, через (Arrays.asList())
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );
        for (Bubble bubble : bubbles) {
            System.out.println(bubble);
        }
        System.out.println("_____________________________________________");

        //Проитерировать список через for-each и отпечатать объемы в консоль через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println(" ");
        System.out.println("_____________________________________________");

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("_____________________________________________");

        //Посчитать объем всех пузырей и вывести число в консоль
        int counter = 0;
        for (Bubble bubble : bubbles) {
            counter = counter + bubble.getVolume();
        }
        System.out.println("Объем всех пузырей " + counter);
        System.out.println("_____________________________________________");

        //Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}