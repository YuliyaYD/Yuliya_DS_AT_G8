package homework.day8.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }
        System.out.println("*********************************");


        int count = 0;
        for (String bird : birds) {
            if (countVowels(bird) > 1) {
                count++;
            }
        }

        System.out.println("Количество птиц с более чем одной гласной в названии: " + count);
        System.out.println("*********************************");


        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println(" ");
        System.out.println("*********************************");

        birds.set(3, "Синица");
        System.out.println(birds);
        System.out.println("*********************************");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }


    private static int countVowels(String word) {
        int count = 0;

        List<Character> vowels = Arrays.asList('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я');
        for (char c : word.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}