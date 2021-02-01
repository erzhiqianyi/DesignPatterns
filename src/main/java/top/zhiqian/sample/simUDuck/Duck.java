package top.zhiqian.sample.simUDuck;

public abstract class Duck {

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
