package cycletask;

public class ArrayChangeLastFirstElement {
    public void printArrayChangeLastFirstElement() {
        int[] array = {1, 2, 3, 4, 5};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
