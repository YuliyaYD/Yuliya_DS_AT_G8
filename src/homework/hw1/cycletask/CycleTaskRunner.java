package homework.hw1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileLoop whileLoop = new WhileLoop();
        ForLoop forLoop = new ForLoop();
        ArrayRandom arrayRandom = new ArrayRandom();
        ArrayReverseOrder arrayReverseOrder = new ArrayReverseOrder();
        ArrayMul5 arrayMul5 = new ArrayMul5();
        ArraySquare arraySquare = new ArraySquare();
        ArrayMin arrayMin = new ArrayMin();
        ArrayChangeLastFirstElement arrayChangeLastFirstElement = new ArrayChangeLastFirstElement();
        ArraySortDescend arraySortDescend = new ArraySortDescend();

        forLoop.printOddNumbers();
        whileLoop.printAllNumbers();
        arrayRandom.printArrayRandom();
        arrayReverseOrder.printArrayReverse();
        arrayMul5.printArrayMul5();
        arraySquare.printSquare();
        arrayMin.printMin();
        arrayChangeLastFirstElement.printArrayChangeLastFirstElement();
        arraySortDescend.printArraySortDescend();
    }
}