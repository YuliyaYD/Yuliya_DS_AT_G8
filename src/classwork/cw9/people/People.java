package classwork.cw9.people;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class People {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман", 72, Person.Sex.MAN));

        people.stream().sorted( (o1, o2) -> {
            if (o1.sex != o2.sex) {
                return o1.sex.compareTo(o2.sex);
            }
            return o1.age - o2.age;
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());



    }
}