import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Average value is: " + foo());

    }


        public static double foo() {
            int[] array = new int[2];
            int sum = 0;
            double average = 0;
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
                sum = sum + array[i];
            }
            for (int j: array){
                System.out.println(j);
            }
            return average = sum / array.length;
        }
}
