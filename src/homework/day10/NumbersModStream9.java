package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersModStream9 {
    public static void main(String[] args) {
        //Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090)
        // через (Stream.of())
        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        //Отфильтровать те числа, которые содержать цифру 3
        List<String> numbersModString = numbersMod.stream().map(String::valueOf).toList();//переводим в лист стрингов
        System.out.println(numbersModString);
        System.out.println(numbersModString.stream().filter(s -> s.contains("3")).collect(Collectors.toList()));

        //Разбить числа на отдельные цифры и заменить цифры соответствующими словами
        //Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки
        System.out.println(numbersModString.stream().flatMap(s -> Arrays.stream(s.split(""))).collect(Collectors.toList()));
        System.out.println(numbersModString.stream().flatMap(s -> Arrays.stream(s.split(""))).map(s -> s.replaceAll("0", "ноль"))
                .map(s -> s.replaceAll("1", "один"))
                .map(s -> s.replaceAll("2", "два"))
                .map(s -> s.replaceAll("3", "три"))
                .map(s -> s.replaceAll("4", "четыре"))
                .map(s -> s.replaceAll("5", "пять"))
                .map(s -> s.replaceAll("6", "шесть"))
                .map(s -> s.replaceAll("7", "семь"))
                .map(s -> s.replaceAll("8", "восемь"))
                .map(s -> s.replaceAll("9", "девять")).distinct().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList()));
    }
}