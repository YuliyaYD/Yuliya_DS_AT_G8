package homework.day6.task1;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassString = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassString.genericMethodOneGenArg("first");
        System.out.println(genericMethodsInGenericClassString.genericMethodTwoGenArgs("second", "third"));
        genericMethodsInGenericClassString.genericMethodHalfGenArgs("4", "5");
        System.out.println("***************************************************************");

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassInteger = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassInteger.genericMethodOneGenArg(4);
        System.out.println(genericMethodsInGenericClassInteger.genericMethodTwoGenArgs(8, 15));
        genericMethodsInGenericClassInteger.genericMethodHalfGenArgs(7, "dog");
        System.out.println("***************************************************************");

        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassDouble = new GenericMethodsInGenericClassT<>();

        genericMethodsInGenericClassDouble.genericMethodOneGenArg(5.5);
        System.out.println(genericMethodsInGenericClassDouble.genericMethodTwoGenArgs(8.9, 7.7));
        genericMethodsInGenericClassDouble.genericMethodHalfGenArgs(5.55, "cat");
    }
}