package top.zhiqian.sample.simUDuck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println(" rubber duck can't quack.");
    }

    @Override
    public void display() {
        System.out.println("this is a rubber duck.");
    }
}
