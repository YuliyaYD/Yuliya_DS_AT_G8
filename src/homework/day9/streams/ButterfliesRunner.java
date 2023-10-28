package homework.day9.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //Добавить к каждому элементу кавычки
        butterflies = butterflies.stream()
                .map(b -> ("\"" + b + "\""))
                .collect(Collectors.toList());

        // Выводим результат
        butterflies.forEach(System.out::println);

        System.out.println("**************************************");

        //Оставить только те слова, которые содержат букву "a" и букву "о"
        List<String> filteredWords = butterflies.stream()
                .filter(word -> word.contains("a") && word.contains("o"))
                .collect(Collectors.toList());

        //Вывести слова в консоль с новой строки
        filteredWords.forEach(System.out::println);
    }
}