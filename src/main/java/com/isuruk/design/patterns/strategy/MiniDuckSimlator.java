package com.isuruk.design.patterns.strategy;

public class MiniDuckSimlator {

    /**
     *
     * Strategy - defines a family of algorithms,
     * encapsulate each one, and make them
     * interchangeable. Strategy lets the algorithm
     * vary independently from client that use it.
     */

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
