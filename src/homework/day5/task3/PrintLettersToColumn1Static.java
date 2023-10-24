package homework.day5.task3;

public class PrintLettersToColumn1Static {
    public static void printLettersToColumn(String s) {
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
