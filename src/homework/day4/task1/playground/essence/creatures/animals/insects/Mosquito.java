package homework.day4.task1.playground.essence.creatures.animals.insects;

import homework.day4.task1.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String animalName) {
        super(mass, animalName);
    }

    @Override
    public void fly(String direction) {

    }
}
