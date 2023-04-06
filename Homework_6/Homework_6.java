package Homework_6;

import java.util.Arrays;
import java.util.HashSet;

import static Homework_6.Person.moreTwentyYears;
import static Homework_6.Person.namesake;

public class Homework_6 {
    public static void main(String[] args) {
        Person p1 = new Person("Stanislav", "Tkachenko", 32, "man", 100);
        Person p2 = new Person("Andrew", "Sirotin", 31, "man", 200);
        Person p3 = new Person("Oleg", "Bocharov", 21, "man", 200);
        Person p4 = new Person("Yulia", "Kuranova", 27, "woman", 300);
        Person p5 = new Person("Maria", "Frolova", 18, "woman", 224);
        Person p6 = new Person("Maxim", "Grigorev", 25, "man",  342);
        Person p7 = new Person("Ivan", "Voitenko", 19, "man", 434);

        System.out.println(p1);  // fn:Ivan ln:Ivanov age:34 gender:men id:100

        System.out.println(p1 == p2);  // false
        System.out.println(p1.equals( p2 ));  // false
        System.out.println(p2.equals( p3 ));  // true

        HashSet<Person> persons = new HashSet<Person>( Arrays.asList(p1, p2, p3, p4, p5, p6, p7) );

        namesake(persons);

        moreTwentyYears( persons );
    }
}

/*
Создать класс Person.
У класса должны быть поля:
1. Имя (String)
2. Фамилия (String)
3. Возраст (продумать тип)
4. Пол
5*. Придумать свои собственные поля
Для этого класса
1. Реализовать методы toString, equals и hashCode.
2*. Придумать собственные методы и реализовать их
В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
 */