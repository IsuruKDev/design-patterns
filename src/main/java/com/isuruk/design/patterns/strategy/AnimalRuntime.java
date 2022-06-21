package com.isuruk.design.patterns.strategy;

public class AnimalRuntime {

    /**
     *  Code to interface (Program to supertype).
     *  It could be abstract class OR interface
     *  User doesn't need to know actual animal type.
     *  All we care about is that it knows how to respond to makeSound()
     *
     * */

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}
