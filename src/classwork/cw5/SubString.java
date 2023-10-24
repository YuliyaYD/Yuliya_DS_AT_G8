package classwork.cw5;

public class SubString {
    public static void main(String[] args) {
        String text = "Hello world";
        char aChar = text.charAt(4);
        System.out.println(aChar);
        String roar = text.substring(0, 5);
        System.out.println(roar);
        String lower = text.toLowerCase();
        System.out.println(lower);
        String replaced = text.replace('o', 'a');
        System.out.println(replaced);
    }
}
