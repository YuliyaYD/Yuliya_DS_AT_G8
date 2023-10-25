package homework.day8.lists;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");
//Проитерировать список через for-each и отпечатать слова в консоль через тире
        StringBuilder sb = new StringBuilder();
        for (String noodle : noodles) {
            if (sb.length() > 0) {
                sb.append(" - ");
            }
            sb.append(noodle);
        }
        System.out.println(sb);
        System.out.println("______________________________");


  //Заменить в каждом слове буквы "а" на букву "о"
        for (int i = 0; i < noodles.size(); i++) {
            String newNoodle = noodles.get(i).replace('a', 'o');
            noodles.set(i, newNoodle);
        }

        for (String noodle : noodles) {
            System.out.println(noodle);
        }
        System.out.println("______________________________");



//Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}