package homework.day10;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureStream15 {
    public static void main(String[] args) {
        Stream<Chair> chairs = Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45))
                .filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).reversed()
                        .thenComparing(Chair::getWidth).reversed());
        Random random = new Random();
        Stream<Chair> newChairs = chairs.map(chair -> new Chair(chair.getHeight()/2, chair.getWidth() * (3 + random.nextInt(8))));
        Stream<Integer> newChairs2 = newChairs.map(c -> c.getHeight() * c.getWidth()).distinct();
        Integer maxValue = newChairs2.max(Integer::compareTo).orElse(0);
        System.out.println(maxValue);


    }
}
