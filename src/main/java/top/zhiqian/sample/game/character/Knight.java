package top.zhiqian.sample.game.character;

import top.zhiqian.sample.game.Character;
import top.zhiqian.sample.game.weapon.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        setWeapon(new BowAndArrowBehavior());

    }

    @Override
    public void display() {
        System.out.println("I'm Knight");
    }
}
