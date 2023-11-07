package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementsStream7 {
    public static void main(String[] args) {
        //Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Radio, Breadcrumb)
        // (через Stream.of())
        //Если слово нечетное, то заменить в нем все буквы "e" на букву "o", а если четное,
        // то заменить слово на число количества буков в этом слове

        String[] elementsArray = {"Text field", "Radio", "Check-box", "Radio", "Drop-down", "Picker", "Breadcrumb", "Radio"};
        Stream<String> elementsStream = IntStream.range(0, elementsArray.length)
                .mapToObj(i -> {
                    if ((i) % 2 == 0) {
                        return elementsArray[i].replace("e", "o");
                    } else {
                        return String.valueOf(elementsArray[i].length());
                    }
                });
        List<String> elementsList = elementsStream.collect(Collectors.toList());
        System.out.println(elementsList);
        System.out.println("**********************************");

        //Оставить в потоке только уникальные значения
        //Отпечатать в консоль с новой строки
        Stream<String> elementsStream2 = Stream.of(elementsArray);
        elementsStream2.distinct().forEach(System.out::println);
    }
}