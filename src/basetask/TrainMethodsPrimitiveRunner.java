package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(5);
        trainMethodsPrimitive.printLong(1000000);
        trainMethodsPrimitive.printChar('w');
        trainMethodsPrimitive.printFloat(123.33333F);
        trainMethodsPrimitive.printDouble(1.123);
        trainMethodsPrimitive.printShort((short)5);
        trainMethodsPrimitive.printByte((byte)1);
        trainMethodsPrimitive.printBoolean(true);
    }
}
