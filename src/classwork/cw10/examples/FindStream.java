package classwork.cw10.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindStream {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(25, 34, 79, 23426, 68, 1324, 55, 7699).toList();
        System.out.println(numbers.stream().findFirst().orElse(0));
        System.out.println(numbers.stream().findFirst().get());

        System.out.println(numbers.stream().findAny());

        System.out.println((long) numbers.size());
        System.out.println(numbers.stream().count());

        System.out.println(numbers.stream().filter(n -> n.equals(79)).toList());
        System.out.println(numbers.stream().filter(n -> n.equals(79)).count());




    }
}
