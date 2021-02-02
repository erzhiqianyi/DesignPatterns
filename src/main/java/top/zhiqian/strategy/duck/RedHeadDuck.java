package top.zhiqian.strategy.duck;

import top.zhiqian.strategy.Duck;
import top.zhiqian.strategy.behavior.quack.Quack;
import top.zhiqian.strategy.behavior.fly.FlyWithWings;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println(" I'm a real red Heaed duck");
    }
}
