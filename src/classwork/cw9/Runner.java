package classwork.cw9;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 0);
    }
}


//mc.justMethod(new IMyInterface() {
//@Override
//public double doSomething() {
//        return 0;
//        }
//        });
