package homework.day4.task1.playground.essence.creatures.animals.vertebrates;

import homework.day4.task1.playground.essence.creatures.animals.Animal;
import homework.day4.task1.playground.essence.creatures.animals.insects.Insect;

public abstract class Vertebrate extends Animal {

    public Vertebrate(int mass, String animalName) {
        super(mass, animalName);
    }

    public void eat(Insect food){
        System.out.println(String.format("I am %s and I am eating %s", this.animalName, food.getAnimalName()));
    }
}