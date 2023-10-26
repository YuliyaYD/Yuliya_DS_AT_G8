package homework.day6.task1;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T x) {
        String s1 = String.format("I am an object of %s class", x.getClass().getSimpleName());
        System.out.println(s1);
    }

    public Object genericMethodTwoGenArgs(T x, T y) {
        return String.format("We are objects of %s class and %s class",
                x.getClass().getSimpleName(), y.getClass().getSimpleName());
    }

    public void genericMethodHalfGenArgs(T x, String y) {
        String s3 = String.format("I got an object of %s class and string with %s characters",
                x.getClass().getSimpleName(), y.getClass().getSimpleName());
        System.out.println(s3);

    }
}