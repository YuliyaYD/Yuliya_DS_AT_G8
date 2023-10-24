package classwork.cw7.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleColors {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String list : colors) {
            System.out.print(list + " ");
        }

        colors.add(2, "Pink");
        colors.add(4, "Yellow");



        for (int i = 0;i < colors.size();i++) {
            System.out.print(i + " ");
        }

        System.out.println(colors.get(1));
    }
}
