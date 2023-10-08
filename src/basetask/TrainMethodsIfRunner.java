package basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(10));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(300L));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('y'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(0.67f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(800));
        trainMethodsIf.returnNewBoolean(true);

    }
}
