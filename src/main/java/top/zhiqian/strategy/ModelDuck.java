package top.zhiqian.strategy;

public class ModelDuck extends Duck{

    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    void display() {
        System.out.println(" I'm a model duck");
    }
}
