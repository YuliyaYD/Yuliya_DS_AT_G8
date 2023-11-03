package homework.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleStream12 {
    public static void main(String[] args) {
        //Создать поток данных people класса Person (через new Stream.of)
        // с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
        List<Person> people = Stream.of
                (new Person(32, "Коля"), new Person(24,"Оля"), new Person(55,"Вася"), new Person(63,"Маша")).toList();

        //Отфильтровать людей, которые моложе 60
        people.stream().filter(a -> a.getAge() < 60).forEach(System.out::println);
        System.out.println("**************************************************");

        //Отсортировать в восходящем порядке по именам
        //?????????????

        //На основании существующего потока данных создать новый, в котором каждый
        // новый Person имеет возраст на 4 года больше исходного

        List<Person> newPeople = people.stream().map(person -> new Person(person.getAge() + 4, person.getName())).toList();
        newPeople.forEach(System.out::println);
        System.out.println("**************************************************");

        //Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл
        System.out.println("Средний возраст людей " + newPeople.stream().mapToInt(Person::getAge).average());



    }
}