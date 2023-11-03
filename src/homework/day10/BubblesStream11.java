package homework.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubblesStream11 {
    public static void main(String[] args) {
        //Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5)
        // и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
        List<Bubble> bubbles =
                Arrays.asList(new Bubble(2,"CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        //В потоке данных отфильтровать только те пузыри, обьем которых больше 3
        System.out.println(bubbles.stream().filter(b -> b.getVolume() > 3).collect(Collectors.toList()));
        System.out.println("*******************************************");

        //Отсортировать данные по имени в восходящем порядке
        //???????????

        //На основании существующего потока данных создать новый, в котором каждый
        // новый Bubble имеет обьем в 3 раза больше исходного
        List<Bubble> newBubbles = bubbles.stream().map(bubble -> new Bubble(bubble.getVolume() * 3, bubble.getName()))
                .toList();
        newBubbles.forEach(System.out::println);
        System.out.println("*******************************************");

        //Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль
        System.out.println("Сумма конечного обьема всех пузырей " + newBubbles.stream().mapToInt(Bubble::getVolume).sum());
    }
}