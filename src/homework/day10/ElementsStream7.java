package homework.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementsStream7 {
    public static void main(String[] args) {
        //Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
        // (через Stream.of())
        Stream<String> elements =
                Stream.of("Text field", "Radio", "Check-box", "Radio", "Drop-down", "Picker", "Breadcrumb", "Radio");

        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное,
        // то заменить слово на число количества буков в этом слове
        //??????????????????????

        //Оставить в потоке только уникальные значения
        //Отпечатать в консоль с новой строки
        elements.distinct().forEach(System.out::println);
    }
}