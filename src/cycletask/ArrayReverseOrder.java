package cycletask;

public class ArrayReverseOrder {
        public void printArrayReverse() {
            int[] array = {1, 2, 3, 4, 5};
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }

}
