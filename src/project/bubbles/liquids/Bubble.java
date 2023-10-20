package project.bubbles.liquids;

public class Bubble {
    final private double VOLUME = 0.33;

    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public static void cramp() {
        System.out.println("Cramp!");
    }

    public double getVOLUME() {
        return VOLUME;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
}