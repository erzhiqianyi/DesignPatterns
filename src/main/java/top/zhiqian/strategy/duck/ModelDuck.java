package top.zhiqian.strategy.duck;

import top.zhiqian.strategy.Duck;
import top.zhiqian.strategy.behavior.quack.Quack;
import top.zhiqian.strategy.behavior.fly.FlyNoWay;

public class ModelDuck extends Duck {

    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println(" I'm a model duck");
    }
}
