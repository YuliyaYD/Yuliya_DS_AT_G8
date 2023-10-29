package classwork.cw9;

public class RunnerOb {
    public static void main(String[] args) {
        MyObClass mc = new MyObClass();
        mc.justMethod(new IMyObInterface() {
            @Override
            public ClassX doSomething(String string) {
                return new ClassX(string);
            }
        });
    }
}

//mc.justMethod(new IMyObInterface() {
//@Override
//public ClassX doSomething(String string) {
//        return new ClassX(string);
//        }
//        });

//mc.justMethod(string -> new ClassX(string));

//mc.justMethod(ClassX::new);

