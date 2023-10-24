package classwork.cw7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {

            BufferedReader in = new BufferedReader(new FileReader("C:/Users/Yuliya/IdeaProjects/GitProjects/Yuliya_DS_AT_G8/file.txt"));

            int character;

            while ((character = in.read()) != -1) {

                System.out.print((char) character);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
