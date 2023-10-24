package homework.day7.task1;

import java.util.Scanner;

public class PrintWithScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your frase:");

        String frase = scanner.nextLine();

        System.out.println("Hello, I just got " + frase + " from you!");
        scanner.close();
    }
}
