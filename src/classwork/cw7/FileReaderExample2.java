package classwork.cw7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
    public static void main(String[] args) throws IOException {
        FileReaderExample2.read();

    }
    public static void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("c:\\Users\\Yuliya\\IdeaProjects\\GitProjects\\file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}