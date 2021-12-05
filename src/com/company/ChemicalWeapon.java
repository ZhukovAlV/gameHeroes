package com.company;

public class ChemicalWeapon extends Weapon {

    void shoot() {
        System.out.println("Произведен выстрел химического оружие");
    }

    public ChemicalWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
