package homework.day5.task3;

public class PrintDigitsToArray3 {
    public void printDigitsToArray(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}