package top.zhiqian.strategy.behavior.fly;

import top.zhiqian.strategy.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
