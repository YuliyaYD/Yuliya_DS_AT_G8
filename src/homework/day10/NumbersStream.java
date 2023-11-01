package homework.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersStream {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbers из 8 чисел
        // (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        //В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
        numbers.stream().forEach(System.out::println);
        System.out.println("***************************************");

        //Отсортировать и снова отпечатать в консоль с новой строки
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("***************************************");

        //Посчитать количество чисел и вывести результат в консоль
        System.out.println(numbers.stream().count());
        System.out.println("***************************************");

        //Посчитать сумму всех чисел и вывести результат в консоль
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Integer sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);

        Integer sum3 = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum3);
    }
}