package cycletask;
import java.util.Arrays;

public class ArraySortDescend {
    public void printArraySortDescend() {
        int[] array = {12, 28, 0, -43, 511};
        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
