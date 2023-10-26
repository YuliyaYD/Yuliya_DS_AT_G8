package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");


        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println(" ");
        System.out.println("*********************************");


        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.println("Количество стран, в названии которых меньше 7 букв, - " + counter);
        System.out.println("*********************************");


        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}