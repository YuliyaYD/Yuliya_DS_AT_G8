package classwork.cw9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMatch {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        //Найти существуют ли хоть один «мама» элемент в коллекции
        System.out.println(list.stream().anyMatch("мама"::equals));
        //Найти есть ли символ «м» у всех элементов коллекции
        System.out.println(list.stream().allMatch(s -> s.contains("м")));
        //Добавить "м" в конец каждого элемента и собрать в коллекцию
        System.out.println(list.stream().map(s -> s + "м").collect(Collectors.toList()));
        //Разделить все слова из коллекции по букве «а», убрать пустые элементы
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("а")))
                .filter(s -> !s.equals("")).collect(Collectors.toList()));

    }
}
