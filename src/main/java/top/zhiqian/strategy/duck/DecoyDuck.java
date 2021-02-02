package top.zhiqian.strategy.duck;

import top.zhiqian.strategy.Duck;
import top.zhiqian.strategy.behavior.fly.FlyNoWay;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck decoy");
    }
}
