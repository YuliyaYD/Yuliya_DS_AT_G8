package homework.day7.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreateFolders {
    public static void main(String[] args) {

        String pathToFolder = "c:\\Users\\Yuliya\\IdeaProjects";


        for (int i = 1; i <= 4; i++) {
            pathToFolder = pathToFolder + "\\" + "folder" + i;
        }
        File folders = new File(pathToFolder);
        if (!folders.exists()) {
            folders.mkdirs();
        }

        //файлы
        for (int i = 1; i <= 2; i++) {
            File file = new File(folders, "file" + i + ".txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                Random random = new Random();
                for (int j = 0; j < 10; j++) {
                    writer.write(Integer.toString(random.nextInt()));
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}