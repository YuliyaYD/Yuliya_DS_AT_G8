package homework.day7.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileCountWords {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader
                    (new FileReader("c:\\Users\\Yuliya\\IdeaProjects\\folder1\\folder2\\folder3\\folder4\\file1.txt"));

            String line;
            int punctuationCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                punctuationCount += countPunctuations(line);
                wordCount += countWords(line);
            }

            reader.close();

            System.out.println("Number of punctuation marks: " + punctuationCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int countPunctuations(String text) {
        Pattern pattern = Pattern.compile("[.,;:!?-]");
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}