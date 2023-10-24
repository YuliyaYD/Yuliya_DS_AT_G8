package classwork.cw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriter {
    public static void read() throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null){
            System.out.println(line);
        }
        in.close();
    }

    public static void main(String[] args) {

    }
}
