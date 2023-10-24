package classwork.cw5;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("123456789");
        builder.delete(1, 3);
        System.out.println(builder);
    }
}