package homework.day9.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        //Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс)
        // через (Stream.of())
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .collect(Collectors.toList());
        System.out.println(figures);
        System.out.println("************************************");


        //Заменить каждое слово на целое число, соответствующее количеству буков в слове
        List<Integer> lettersNumberList = figures.stream().map(word -> word.length()).collect(Collectors.toList());
        System.out.println(lettersNumberList);
        System.out.println("************************************");

        //Отфильтровать числа, которые больше 4
        List<Integer> filteredNumbers = lettersNumberList.stream().filter(x -> x > 4).collect(Collectors.toList());
        System.out.println(filteredNumbers);
    }
}