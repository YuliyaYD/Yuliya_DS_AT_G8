package homework.day5.task3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class PrintChangedDataFormat6Static {
    public static void returnDateInDifferentFormat(String inputDate) {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        LocalDateTime date = LocalDateTime.parse(inputDate, inputFormat);

        DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        String outputString = date.format(expectedFormat);
        System.out.println(outputString);
    }

}
