package classwork.cw5;

public class StringBuilderDeleteCharAt {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("123456789");
        builder.deleteCharAt(5);
        System.out.println(builder);
    }
}
