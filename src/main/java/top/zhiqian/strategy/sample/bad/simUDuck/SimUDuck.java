package top.zhiqian.strategy.sample.bad.simUDuck;

public abstract class SimUDuck {

    public void quack() {
        System.out.println(" I am duck , quack  , quack");
    }

    public void swim() {
        System.out.println(" I can swim ,I am swimming ");
    }


    public void fly() {
        System.out.println("I can fly.  I am flying");
    }

    public abstract void display();
}
