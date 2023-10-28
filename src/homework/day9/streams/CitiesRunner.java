package homework.day9.streams;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int lettersAmount = cities.stream().mapToInt(city -> city.length()).sum();
        System.out.println(lettersAmount);//
    }
}