package homework.day4.task1.playground.essence.creatures.animals.vertebrates;

import homework.day4.task1.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrate implements Crawlable {
    public Crocodile(int mass, String animalName) {
        super(mass, animalName);
    }

    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for %d units", Crocodile.class.getSimpleName(), this.animalName, direction, distance));
        System.out.println("wr-wr-wrr-r..");
    }
}
