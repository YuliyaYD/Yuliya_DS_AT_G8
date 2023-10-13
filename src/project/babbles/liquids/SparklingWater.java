package project.babbles.liquids;

public class SparklingWater extends Water {
    public Babble[] bubbles;

    public void pump(Babble[] bubbles) {
        this.bubbles = bubbles;
    }
}
