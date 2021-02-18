package top.zhiqian.strategy.sample.bad.simUDuck;

public class RubberSimUDuck extends SimUDuck {

    @Override
    public void quack() {
        System.out.println(" rubber duck can't quack.");
    }

    @Override
    public void display() {
        System.out.println("this is a rubber duck.");
    }
}
