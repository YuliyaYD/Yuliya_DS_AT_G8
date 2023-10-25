package homework.day8.lists;

import homework.day8.precondition.Bubble;
import homework.day8.precondition.Water;

import java.util.Arrays;
import java.util.List;

public class Waters {
    public static void main(String[] args) {
        //Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная)
        // и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
        List<Water> waters = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );
        for (Water water : waters) {
            System.out.println(water);
        }
        System.out.println("_____________________________________________");

        //Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки
        for (Water water : waters) {
            System.out.println(water.getColor() + " - " + water.getSmell());
        }
    }
}