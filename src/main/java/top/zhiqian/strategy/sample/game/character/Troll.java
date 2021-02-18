package top.zhiqian.strategy.sample.game.character;

import top.zhiqian.strategy.sample.game.Character;
import top.zhiqian.strategy.sample.game.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm Troll");
    }
}
