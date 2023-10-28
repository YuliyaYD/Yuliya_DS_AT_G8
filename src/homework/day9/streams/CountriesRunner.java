package homework.day9.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        //Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия", "Тнш").collect(Collectors.toList());
        System.out.println(countries);
        System.out.println("********************************************");

        //Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
        List<String> countriesWithVowels = countries.stream()
                .filter(country -> country.matches(".*[АаЕеЁёИиОоУуЫыЭэЮюЯя].*")).collect(Collectors.toList());
        System.out.println(countriesWithVowels);
        System.out.println("********************************************");

        //Отфильтровать страны, в названии которых меньше 7 букв
        List<String> countriesLess7Letters = countries.stream().filter(l -> l.length() < 7).collect(Collectors.toList());
        System.out.println(countriesLess7Letters);
        System.out.println("********************************************");

        //Перевести все страны в верхний регистр
        List<String> countriesToUpperCase = countries.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(countriesToUpperCase);
        System.out.println("********************************************");

        //Добавить к каждому названию кавычки
        //Отпечатать в консоль с новой строки
        countries = countries.stream()
                .map(b -> ("\"" + b + "\""))
                .collect(Collectors.toList());
        countries.forEach(System.out::println);

    }
}