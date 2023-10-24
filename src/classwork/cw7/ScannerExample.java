package classwork.cw7;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");

        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
        scanner.close();
    }
}