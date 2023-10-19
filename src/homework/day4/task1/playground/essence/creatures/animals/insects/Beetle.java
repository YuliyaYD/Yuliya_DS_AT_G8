package homework.day4.task1.playground.essence.creatures.animals.insects;

import homework.day4.task1.playground.essence.creatures.Crawlable;
import homework.day4.task1.playground.essence.creatures.plants.Plant;
import homework.day4.task1.playground.essence.creatures.plants.vegetables.Carrot;

import static homework.day4.task1.playground.essence.creatures.plants.Plant.*;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String animalName) {
        super(mass, animalName);
    }

    public void nest(Carrot home){
        if (this.mass < home.getMass()) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", this.animalName, home.getMass() % this.mass));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for %d units", Beetle.class.getSimpleName(), this.animalName, direction, distance));
        System.out.println("vz-vz-vzz-zz..");
    }
}