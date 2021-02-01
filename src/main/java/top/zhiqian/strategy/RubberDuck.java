package top.zhiqian.strategy;

public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
