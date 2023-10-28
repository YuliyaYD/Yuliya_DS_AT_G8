package classwork.cw9;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мама");
        System.out.println(list.stream().filter(y -> y.equals("мама")).count());

    }

}

//"мама"::equils