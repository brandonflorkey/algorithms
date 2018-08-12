package com.florkey;

public class Human {
    String name;
    int heightInInches;
    int age;
    String eyeColor;

    public Human(String name, int heightInInches, int age, String eyeColor) {
        this.name = name;
        this.heightInInches = heightInInches;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }
}
