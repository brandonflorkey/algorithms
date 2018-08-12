package com.florkey;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Tom", 76, 25, "blue");
        Human human2 = new Human("Joe", 68,28, "green");

        human1.speak();
        human2.speak();

    }
}
