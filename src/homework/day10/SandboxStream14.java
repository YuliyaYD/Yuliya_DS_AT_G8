package homework.day10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandboxStream14 {
    public static void main(String[] args) {
        //Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        //Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и
        // именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        //Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
        //Отсортировать по весу в восходящем порядке
        List<Sand> newSandbox = sandbox.stream().filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight)).toList();
        System.out.println(newSandbox);
        System.out.println("************************************");

        //На основании существующего потока данных создать новый, в котором каждый новый Sand имеет
        // вес умноженный на 2, и имя в верхнем регистре
        List<Sand> newSandbox2 = newSandbox.stream()
                .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                .toList();
        System.out.println(newSandbox2);
        System.out.println("************************************");

        //На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
        Map<Integer, String> sandMap
                = newSandbox2.stream().collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        //Отпечатать каждый из элементов карты в виде value:key в текстовый файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sand.txt"))) {
            sandMap.forEach((weight, name) -> {
                try {
                    writer.write(name + ": " + weight + System.lineSeparator());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}