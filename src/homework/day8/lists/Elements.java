package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.println("_______________________________");

        int count = 0;
        for (String element : elements) {
            if (element.split("\\s+|-").length > 1) {
                count++;
            }
        }
        System.out.println("Количество элементов, которые состоят более чем из одного слова: " + count);
        System.out.println("_______________________________");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("________________________________");

        elements.add(4, "Spinner");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("________________________________");

        elements.remove(2);
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("________________________________");

        elements.set(5, "Switch");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}