package homework.day4.task1.playground.essence.creatures.plants;

import homework.day4.task1.playground.essence.Matter;

public abstract class Plant extends Matter {

    public static Matter mass;
    protected String plantName;



    public Plant(int mass, String plantName) {
        super(mass);
        this.plantName = plantName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
}
