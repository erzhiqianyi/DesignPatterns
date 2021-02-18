package top.zhiqian.strategy.sample.game.weapon;

import top.zhiqian.strategy.sample.game.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("user sword.");
    }
}
