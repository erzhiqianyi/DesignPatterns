package top.zhiqian.strategy.duck;

import top.zhiqian.strategy.Duck;
import top.zhiqian.strategy.behavior.quack.Squeak;
import top.zhiqian.strategy.behavior.fly.FlyNoWay;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
