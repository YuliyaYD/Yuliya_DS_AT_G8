package homework.day8.lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Figures {
    public static void main(String[] args) throws IOException {
        List<String> figures = new ArrayList<>();
        figures.add("Овал");
        figures.add("Прямоугольник");
        figures.add("Круг");
        figures.add("Квадрат");
        figures.add("Эллипс");


        StringBuilder stringBuilder = new StringBuilder();
        for (String figure : figures) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(" - ");
            }
            stringBuilder.append(figure);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter
                ("c:\\Users\\Yuliya\\IdeaProjects\\GitProjects\\Yuliya_DS_AT_G8\\src\\file_figures.txt"))) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


        int counter = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                counter++;
            }
        }
        System.out.println(counter + " фигур НЕ содержат букву \"и\" ");

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }
        System.out.println(" ");


        figures.set(3, "Треугольник");
        System.out.println(figures);

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}