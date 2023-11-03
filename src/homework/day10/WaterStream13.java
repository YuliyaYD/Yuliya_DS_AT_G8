package homework.day10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterStream13 {
    public static void main(String[] args) {
        //Создать поток данных water класса Water (через new Stream.of)
        List<Water> waters = Stream.of(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"), new Water("Синяя", "Мятный")).toList();

        //Отфильтровать воду, цвет которой не "Прозрачная"
        waters.stream().filter(w -> !w.getColor().equals("Прозрачная")).forEach(System.out::println);
        System.out.println("********************************");

        //Отсортировать в нисходящем порядке по запаху
        waters.stream().sorted(Comparator.comparing(Water::getSmell).reversed()) // Сортировка по запаху в нисходящем порядке
                .forEach(System.out::println);
        System.out.println("********************************");

        //На основании существующего потока данных создать новый, в котором
        // каждая новая Water имеет запах с удвоенной буквой ы, если такая встречается
        List<Water> newWater = waters.stream()
                .map(water -> {
                    String newSmell = water.getSmell().replace("ы", "ыы");
                    return new Water(water.getColor(), newSmell);
                })
                .toList();
        System.out.println(newWater);
        System.out.println("********************************");

        //Обьединить запах всех обьектов в одну строку
        String allSmells = newWater.stream().map(Water::getSmell).collect(Collectors.joining());
        System.out.println(allSmells);

        //Найти количество буков в ней и отпечатаь в консоль
        int counter = allSmells.length();
        System.out.println(counter);
    }
}