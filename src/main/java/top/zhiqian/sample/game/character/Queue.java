package top.zhiqian.sample.game.character;

import top.zhiqian.sample.game.Character;
import top.zhiqian.sample.game.weapon.KnifeBehavior;

public class Queue extends Character {

    public Queue() {
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm Queue");
    }
}
