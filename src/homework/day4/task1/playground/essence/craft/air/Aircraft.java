package homework.day4.task1.playground.essence.craft.air;

import homework.day4.task1.playground.essence.Flyable;
import homework.day4.task1.playground.essence.Matter;
import homework.day4.task1.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {

    public Aircraft(int mass, String name) {
        super(mass);

    }


}
