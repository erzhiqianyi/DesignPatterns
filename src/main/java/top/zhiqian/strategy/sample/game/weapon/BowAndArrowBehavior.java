package top.zhiqian.strategy.sample.game.weapon;

import top.zhiqian.strategy.sample.game.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
