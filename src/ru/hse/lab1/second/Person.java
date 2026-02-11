package ru.hse.lab1.second;

public class Person {
    private String name;
    private int age;
    
    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Геттеры для доступа к полям
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}