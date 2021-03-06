package top.zhiqian.strategy;

public abstract class Duck {
    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float , even decoys ");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
