package top.zhiqian.sample.game;

public abstract class Character {

    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public WeaponBehavior showWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void display();

}
