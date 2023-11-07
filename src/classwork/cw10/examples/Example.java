package classwork.cw10.examples;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Ann", "Vika", "Bet", "Olya");
        List<Integer> list = Arrays.asList(2, 3, 5);
//        System.out.println(list.stream().sorted((o1, o2) -> -o1.compareTo(o2))
//                .distinct().collect(Collectors.toList()));
//        System.out.println("**************************************************");
//
//        String m = list.stream().flatMap(s -> Arrays.stream(s.split("")))
//                .peek(System.out::println)
//                .max(String::compareTo)
//                .get();
//        System.out.println("**************************************************");
//        System.out.println(m);
//        System.out.println("+++++++++++++++++++++++++++");

        System.out.println(list.stream()

                .reduce((x, y) -> x + y + x)
                .get());



    }
}
