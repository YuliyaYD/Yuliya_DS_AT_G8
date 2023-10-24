package classwork.cw7.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String[] array = "мама мыла раму мыла".split(" ");
        for (String st : array) {
            myList.add(st);
        }

        for (String s : myList) {
            System.out.println(s);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
