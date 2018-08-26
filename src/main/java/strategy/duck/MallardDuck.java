package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    void display() {
        System.out.println("Mallard Duck");
    }
}
