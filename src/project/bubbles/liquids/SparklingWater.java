package project.bubbles.liquids;

public class SparklingWater extends Water{

    private boolean isOpened;
    private Bubble[] bubbles;



    public SparklingWater(String color, String transparency, String smell, int temperature, boolean isOpened) {
        super(color, transparency, smell, temperature);
        this.isOpened = isOpened;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }


}
