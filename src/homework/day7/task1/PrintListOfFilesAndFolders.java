package homework.day7.task1;
import java.io.File;
public class PrintListOfFilesAndFolders {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Yuliya\\IdeaProjects\\GitProjects");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }
    }
}