package homework.day5.task3;

import java.util.ArrayList;
import java.util.List;

public class PrintDigitsToArray3 {
    public static void main(String[] args) {
        String str = "8cats, 7 dogs. -3450";
        System.out.println(printDigitsToArray(str));
    }

    public static List<Integer> printDigitsToArray(String str) {
        char[] array = str.toCharArray();
        List<Integer> digitList = new ArrayList<>();
        for (char c : array) {
            if (Character.isDigit(c)) {
                digitList.add(c - '0');
            }
        }
        return digitList;
    }
}