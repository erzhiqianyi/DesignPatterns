package top.zhiqian.strategy.sample.game.character;

import top.zhiqian.strategy.sample.game.Character;
import top.zhiqian.strategy.sample.game.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        setWeapon(new SwordBehavior());
    }

    @Override
    public void display() {
        System.out.println("I'm King");
    }


}
