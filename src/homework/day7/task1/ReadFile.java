package homework.day7.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {

            BufferedReader in = new BufferedReader(new FileReader("c:\\Users\\Yuliya\\IdeaProjects\\folder1\\folder2\\folder3\\folder4\\file1.txt"));

            int character;
            while ((character = in.read()) != -1) {
                System.out.print((char) character);            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}