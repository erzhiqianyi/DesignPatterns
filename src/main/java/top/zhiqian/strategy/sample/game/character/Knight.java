package top.zhiqian.strategy.sample.game.character;

import top.zhiqian.strategy.sample.game.Character;
import top.zhiqian.strategy.sample.game.weapon.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        setWeapon(new BowAndArrowBehavior());

    }

    @Override
    public void display() {
        System.out.println("I'm Knight");
    }
}
