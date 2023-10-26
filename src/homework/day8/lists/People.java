package homework.day8.lists;

import homework.day8.precondition.Person;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static void main(String[] args) {
        //Создать пустой список людей (класса Person) people (через new ArrayList)
        //Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        //Проитерировать список через for-each и отпечатать возраст в консоль через пробел
        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println(" ");
        System.out.println("*********************************");

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел
        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("*********************************");

        //Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}