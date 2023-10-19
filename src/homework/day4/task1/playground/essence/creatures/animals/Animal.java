package homework.day4.task1.playground.essence.creatures.animals;

import homework.day4.task1.playground.essence.Matter;
import homework.day4.task1.playground.essence.creatures.plants.Plant;

public abstract class Animal extends Matter {
    protected String animalName;

    public void eat(Plant food){
        System.out.println(String.format("I am %s and I am eating %s", this.animalName, food.getPlantName()));
    }

    public Animal(int mass, String animalName) {
        super(mass);
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}