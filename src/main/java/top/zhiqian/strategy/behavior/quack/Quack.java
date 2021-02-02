package top.zhiqian.strategy.behavior.quack;

import top.zhiqian.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack ,Quack");
    }
}
