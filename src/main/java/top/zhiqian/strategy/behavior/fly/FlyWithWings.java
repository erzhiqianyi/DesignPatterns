package top.zhiqian.strategy.behavior.fly;

import top.zhiqian.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
       System.out.println("I'm flying with wings ");
    }
}
