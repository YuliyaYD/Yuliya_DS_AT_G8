package homework.day8.lists;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("*********************************");
//Посчитать сумму всех чисел и вывести результат в консоль
        Integer count = 0;
        for (Integer number : numbers) {
            count = count + number;
        }
        System.out.println("Сумма" + count);
        System.out.println("*********************************");
//Отсортировать список по возрастанию
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("*********************************");
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("*********************************");
//Развернуть список в обратном порядке
        Collections.reverse(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("*********************************");
//Проитерировать список через for-each и отпечатать числа в консоль через пробел
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}