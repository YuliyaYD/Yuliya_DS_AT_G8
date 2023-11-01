package homework.day10;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementsStream {
    public static void main(String[] args) {
        //Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
        // (через Stream.of())
        List<String> elements =
                Stream.of("Text field", "Radio", "Check-box", "Radio", "Drop-down", "Picker", "Breadcrumb").toList();

        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное,
        // то заменить слово на число количества буков в этом слове
        //??????????????????????

        //Оставить в потоке только уникальные значения
        //Отпечатать в консоль с новой строки
        elements.stream().distinct().toList().forEach(System.out::println);



    }
}
