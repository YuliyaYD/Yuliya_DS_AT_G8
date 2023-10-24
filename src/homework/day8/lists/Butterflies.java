package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Swallowtail");
        butterflies.add("Common blue");


        for (String butterfly : butterflies) {
            System.out.println("'" + butterfly + "'");
        }
        System.out.println("____________________________");


        int counter = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter + " butterflies contains letter \"о\" ");
        System.out.println("____________________________");


        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("____________________________");


        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
    }
}