package homework.day5.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintCurrentDateTime5 {
    public static void main(String[] args) {
        printCurrentDateTime();
    }

    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        Locale russian = new Locale("ru", "RU");

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM, yyyy", russian);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H 'часа' m 'минут'", russian);

        String date = now.format(dateFormatter);
        String time = now.format(timeFormatter);

        System.out.println("Сейчас на дворе: " + date + ", " + time);
    }
}