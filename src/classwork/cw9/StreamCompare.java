package classwork.cw9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompare {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        //Отсортировать коллекцию строк по алфавиту
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        //Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать
        //дубликаты
        System.out.println(list.stream().sorted(((o1, o2) -> -o1.compareTo(o2)))
                .distinct().collect(Collectors.toList()));
        //Разделить слова по символам, отпечатать результат, выбрать символ с
        //максимальным значение среди букв
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("")))
                .peek(System.out::println).max(String::compareTo).get());
        //Найти сумму общего количества букв во всех словах коллекции
        System.out.println(list.stream().map(String::length)
                .reduce((x, y) -> x + y).get());
        System.out.println(list.stream().mapToInt(String::length).sum());
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());

        //Найти количество букв, из которых состоят слова с нечетным количеством
        //букв
        System.out.println(list.stream().map(String::length)
                .collect(Collectors.summingInt(p -> p % 2 == 1? p: 0)));
        System.out.println(list.stream().map(String::length).mapToInt(p -> p%2 == 1? p:0)
                .sum());
        //Объединить все элементы в одну строку через
        //разделитель “:” и обернуть тегами <p>… </p>
        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "<////p>")));
        //

    }
}
