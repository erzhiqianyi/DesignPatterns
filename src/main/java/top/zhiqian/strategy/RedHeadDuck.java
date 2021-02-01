package top.zhiqian.strategy;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    void display() {
       System.out.println(" I'm a real red Heaed duck");
    }
}
