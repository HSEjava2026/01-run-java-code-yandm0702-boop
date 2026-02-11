package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", 20);
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}