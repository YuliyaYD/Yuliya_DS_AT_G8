package classwork.cw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriterExample.write();
    }

    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("c:\\Users\\Yuliya\\IdeaProjects\\GitProjects\\new_file.txt"));
        out.write("vsvs");
        out.close();
    }
}