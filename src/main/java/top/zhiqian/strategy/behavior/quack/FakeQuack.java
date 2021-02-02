package top.zhiqian.strategy.behavior.quack;

import top.zhiqian.strategy.QuackBehavior;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Fake quack");
    }
}
