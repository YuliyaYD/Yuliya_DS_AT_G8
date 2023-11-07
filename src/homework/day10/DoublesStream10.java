package homework.day10;

import java.util.Random;
import java.util.stream.Stream;

public class DoublesStream10 {
//    public static void main(String[] args) {
//        //Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
//        // через (Stream.of())
//        List<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9).toList();
//        //Округлить каждое число до целого
//        IntStream doublesToIntegers = doubles.stream().mapToInt(Double::intValue);
//        doublesToIntegers.forEach(System.out::println);
////        doubles.stream().mapToInt(Double::intValue).forEach(System.out::println);
//        System.out.println("****************");
//
//        //На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами
//        // от 0 до числа из иходного потока данных
////        doublesToIntegers
////                .mapToObj(s -> Stream.generate(() -> (new Random()).nextInt(doubles.indexOf(s))).limit(s))
////                .toList()
////                .forEach(System.out::println);
//        doublesToIntegers.map(s -> Stream.generate(() -> (new Random()).nextInt(s)).limit(doublesToIntegers
//                .max().getAsInt()).toList().forEach(System.out::println);
//    }


    public static void main(String[] args) {
        Random random = new Random();

        // Создание исходного потока с округлением до целых чисел
        Stream<Integer> roundedStream = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
                .mapToInt(d -> (int) Math.round(d))
                .boxed();
//        System.out.println(roundedStream.collect(Collectors.toList()));

        // Генерация нового потока случайных чисел
        Stream<Integer> randomStream = roundedStream
                .flatMap(n -> Stream.generate(() -> random.nextInt(n + 1)).limit(1)).distinct();

        // Вывод результатов
        randomStream.forEach(System.out::println);
    }
}