package com.company;

public class MagicWeapon extends Weapon {

    void shoot() {
        System.out.println("Создано заклятье");
    }

    public MagicWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
