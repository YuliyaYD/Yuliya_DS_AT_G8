package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int a){
        return a * 3;
    }

    public long returnNewLong(long l){
        return l - 4;
    }

    public String returnNewChar(char ch){
        String s = Character.toString(ch);
        return s + s;
    }

    public float returnNewFloat(float fl){
        return fl / 2;
    }

    public double returnNewDouble(double d){
        return d + 8;
    }

    public short returnNewShort(short sh){
        return (short)(sh - 1);
    }

    public byte returnNewByte(byte bt){
        return (byte)(bt * 2);
    }

    public boolean returnNewBoolean(boolean boo){
        if (boo==true){
            return false;
        } else {
            return true;
        }
    }



}
