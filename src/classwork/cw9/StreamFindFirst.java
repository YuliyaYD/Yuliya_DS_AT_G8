package classwork.cw9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFindFirst {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        //Вернуть первый элемент или «мама», если коллекция пуста
        System.out.println(list.stream().findFirst().orElse("мама"));
        //Вернуть первый элемент равный «мама»
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        //Вернуть первый элемент равный «мама»
        System.out.println(list.stream().skip(4).findFirst().get());
        //Вернуть коллекцию из двух элементов, начиная с третьего
        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));
        //Выбрать коллекцию из уникальных строк, содержащиех «м»
        System.out.println(list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList()));

    }
}
