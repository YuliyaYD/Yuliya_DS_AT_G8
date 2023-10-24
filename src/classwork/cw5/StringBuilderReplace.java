package classwork.cw5;

public class StringBuilderReplace {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("123456789");
        builder.replace(0, 3, "Hello");
        System.out.println(builder);
    }
}
