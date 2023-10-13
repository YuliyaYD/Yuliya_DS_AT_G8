package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(7));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(500L));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('k'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(500F));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(1.23));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short)3));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 1));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));
    }
}
