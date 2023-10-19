package homework.day4.task1.playground.processors;

import homework.day4.task1.playground.essence.Flyable;
import homework.day4.task1.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable){
        flyable.fly(DirectionGenerator.generateDirection());
    }
    public void runFlyable(Flyable flyable, String direction){
        flyable.fly(direction);
    }
}
