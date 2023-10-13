package cycletask;

public class ArraySquare {
    public void printSquare() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] * array[i] + " ");
        }
    }
}
