package top.zhiqian.strategy.sample.game.character;

import top.zhiqian.strategy.sample.game.Character;
import top.zhiqian.strategy.sample.game.weapon.KnifeBehavior;

public class Queue extends Character {

    public Queue() {
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm Queue");
    }
}
