package top.zhiqian.strategy;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Fake quack");
    }
}
