package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars) {
            System.out.println("'" + car + "'");
        }
        System.out.println("---------------------------");

        List<String> cars2 = new ArrayList<>();
        for (String car : cars) {
            if (car.length() <= 4) {
                cars2.add(car);
            }
        }
        System.out.println(cars2);
        System.out.println("---------------------------");

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}