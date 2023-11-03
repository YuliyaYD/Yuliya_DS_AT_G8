package classwork.cw10.examples;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateStream {
    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////");
        System.out.println(Stream.iterate(1, n -> n * 2).limit(10).collect(Collectors.toList()));
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------------------------------------");

        Stream.generate(() -> (new Random()).nextInt(5)).limit(10).forEach(System.out::println);
    }
}
