package basetask;

public class TrainMethodsIf {

    public double returnNewInt(int a){
        if (a < 8){
            return a * 7.0;
        } else {
            return a / 4.0;
        }
    }

    public long returnNewLong(long b){
        if (b > 300){
            return b - 300;
        } else {
            return b + 20;
        }
    }

    public String returnNewChar(char ch){
        if (ch == 'g'){
            return "go";
        } else {
            return "o" + ch;
        }
    }

    public float returnNewFloat(float f){
        if (f == 0.67f){
            return f;
        } else {
            return f * 2;
        }
    }

    public double returnNewDouble(double dn){
        if (dn > 30 && dn < 80){
            return dn + 87;
        } else if (dn > 80 && dn < 400){
            return dn - 87;
        } else if (dn >400){
            return dn / 4;
        } else {
            return dn;
        }

    }

    public void returnNewBoolean(boolean boo){
        if (boo == true){
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }




}
