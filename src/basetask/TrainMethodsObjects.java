package basetask;

public class TrainMethodsObjects {
    Mouse mouse = new Mouse("Masha", 4);
    public void processMouse(){
        System.out.println(mouse.getName() + ", " + mouse.getAge());
        mouse.printMouseDetails();
    }

    Souce souce = new Souce("Pesto", "green");
    public void processSouce(){
        System.out.println(souce.getName() + ", " + souce.getColor());
        souce.printSouceDetails();
    }

    Bee bee = new Bee("male", 10L);
    public void processBee(){
        System.out.println(bee.getGender() + ", " + bee.getWeight());
        bee.printBeeDetails();
    }

    Obstacle obstacle = new Obstacle("tree", "big");
    public void processObstacle(){
        System.out.println(obstacle.getDescription() + ", " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    Pineapple pineapple = new Pineapple("kish", 45.12);
    public void processPineapple(){
        System.out.println(pineapple.getGrade() + ", " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }

}
