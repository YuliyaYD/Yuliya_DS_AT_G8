package classwork.cw5;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        int n = 5;
        String result = "789";
        for (int i = 0; i < n; i++) {
            builder.append("*");
        }
        result = builder.toString();
        System.out.println(result);
    }
}