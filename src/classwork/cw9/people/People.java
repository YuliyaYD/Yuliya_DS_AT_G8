package classwork.cw9.people;

import java.util.Arrays;
import java.util.List;

public class People {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман", 72, Person.Sex.MAN));



    }
}
