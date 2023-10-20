package homework.day5.task3;

public class PrintLettersToColumn1 {
    public static void main(String[] args) {
        PrintLettersToColumn1 printLettersToColumn = new PrintLettersToColumn1();
        printLettersToColumn.printLettersToColumn("dog and cat...");
    }

    public void printLettersToColumn(String s) {
        char[] result = s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}