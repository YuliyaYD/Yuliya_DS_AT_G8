package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int counter = 0;
        for (String city : cities) {
            counter = counter + city.length();
        }
        System.out.println("Сумма всех буков во всех словах " + counter);

        for (String city : cities) {
            System.out.print(city + " ");
        }
    }
}