package homework.hw1.basetask;

//public class TrainMethodsObjectsRunner {
//    public static void main(String[] args) {
//        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
//        trainMethodsObjects.processMouse();
//        trainMethodsObjects.processSouce();
//        trainMethodsObjects.processBee();
//        trainMethodsObjects.processObstacle();
//        trainMethodsObjects.processPineapple();
//    }
//}

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processMouse(new Mouse("Masha", 12));
        trainMethodsObjects.processSouce(new Souce("pesto", "green"));
        trainMethodsObjects.processBee(new Bee("male", 500L));
        trainMethodsObjects.processObstacle(new Obstacle("tree", "big"));
        trainMethodsObjects.processPineapple(new Pineapple("hhhhh", 140));
    }
}