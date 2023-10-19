package project.bubbles.liquids;

public class SparklingWater extends Water {
    public Bubble[] bubbles;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

//    - 1 литр воды содержит 10 тыс пузырьков
//- у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье

    public void degas(double volume){

    }
}
