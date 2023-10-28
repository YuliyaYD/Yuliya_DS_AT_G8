package homework.day9.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
        //Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
        //Оставить в потоке только уникальные названия авто
        List<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").distinct()
                .collect(Collectors.toList());
        System.out.println(cars);
        System.out.println("**************************************************");

        //Отфильтровать только те названия, которые содержат букву "и"
        List<String> filteredCars = cars.stream().filter(word -> word.contains("и")).collect(Collectors.toList());
        System.out.println(filteredCars);
        System.out.println("**************************************************");

        //Все названия привести в верхний регистр
        List<String> upperCaseCars = cars.stream().map(car -> car.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseCars);
        System.out.println("**************************************************");

        //Отпечатать все названия в консоль с новой строки
        cars.forEach(System.out::println);
    }
}