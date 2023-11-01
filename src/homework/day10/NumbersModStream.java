package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersModStream {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090)
        // через (Stream.of())
        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        //Отфильтровать те числа, которые содержать цифру 3
        List<String> numbersModString = numbersMod.stream().map(String::valueOf).toList();//переводим в лист стрингов
        System.out.println(numbersModString.stream().filter(s -> s.contains("3")).collect(Collectors.toList()));

        //Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//        numbersMod.stream().mapToInt()


    }
}