package homework.day8.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        for (Double ddouble : doubles) {
            System.out.print(ddouble + " ");
        }
        System.out.println(" ");
        System.out.println("_________________________________________");

        //Посчитать произведение всех чисел и вывести результат в консоль
        Double count = 1.0;
        for (Double ddouble : doubles) {
            count = count * ddouble;
        }
        System.out.println("Произведение " + count);
        System.out.println("_________________________________________");

//найти сумму всех дробных частей и вывести результат в консоль
        double sum = 0;
        for (double ddouble : doubles) {
            sum += ddouble - (int) ddouble;
        }
        System.out.println("Сумма всех дробных частей: " + sum);
        System.out.println("_________________________________________");

//Проитерировать список по индексу и вывести целые части в консоль через пробел
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < doubles.size(); i++) {
            int integerPart = (int) Math.floor(doubles.get(i));
            sb.append(integerPart).append(" ");
        }
        System.out.println(sb.toString());
    }
}