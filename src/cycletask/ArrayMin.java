package cycletask;

public class ArrayMin {
    public void printMin() {
        int[] array = {11, 2, -3, 554, 775};
        int min = array[0];
        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] < array[i - 1]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
