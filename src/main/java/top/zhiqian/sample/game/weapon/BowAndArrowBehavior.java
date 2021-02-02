package top.zhiqian.sample.game.weapon;

import top.zhiqian.sample.game.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use bow and arrow");
    }
}
