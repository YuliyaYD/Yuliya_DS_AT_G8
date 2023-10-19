package homework.day4.task1.playground.utils;
import java.util.Random;
public class DirectionGenerator {
    public static String generateDirection(){
        Random random = new Random();
        int r = random.nextInt(39);
        System.out.println(r);

        if (r >= 1 && r <= 9) {
            return "NORTH";
        } else if (r >= 10 && r <= 19) {
            return "SOUTH";
        } else if (r >= 20 && r <= 29) {
            return "WEST";
        } else if (r >= 30 && r <= 39) {
            return "EAST";
        } else {
            return "null";
        }
    }
}