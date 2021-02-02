package top.zhiqian.strategy.behavior.quack;

import top.zhiqian.strategy.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak,Squeak");
    }
}
