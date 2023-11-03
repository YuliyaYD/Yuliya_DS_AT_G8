package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsStream6 {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        //Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
        System.out.println(birds.stream().map(s -> s.replace('о', 'а')).map(s -> s.toLowerCase())
                .collect(Collectors.toList()));

        //Убрать все символы мягкого знака
        System.out.println(birds.stream().map(s -> s.replace("ь", "")).collect(Collectors.toList()));

        //Разбить на новые строки по букве "б"
        System.out.println(birds.stream().flatMap(s -> Arrays.stream(s.split("б")))
                .flatMap(s -> Arrays.stream(s.split("Б"))).collect(Collectors.toList()));
        System.out.println("************************************************");

        //Отпечатать в консоль с новой строки в виде --Чайка--
        birds.stream().map(s -> ("--" + s + "--")).toList().forEach(System.out::println);
    }
}