package classwork.cw9;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        //ссылка на метод
        System.out.println(list.stream().filter("мама"::equals).count());
    }
}