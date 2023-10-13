package project.babbles.liquids;

public class Babble {
    final private double VOLUME = 0.33;

    private double gasComposition;

    public Babble(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public double getVOLUME() {
        return VOLUME;
    }

    public double getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(double gasComposition) {
        this.gasComposition = gasComposition;
    }

    public static void cramp(){
        System.out.println("Cramp!");
    }
}
