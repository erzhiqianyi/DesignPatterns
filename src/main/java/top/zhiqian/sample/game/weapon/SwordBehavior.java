package top.zhiqian.sample.game.weapon;

import top.zhiqian.sample.game.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("user sword.");
    }
}
