package com.company;

public class Neutral extends Person {

    String relationToWorld = "Нейтральное";

    public Neutral(String name, double age, int power, int agility, char gender, String superpower, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.agility = agility;
        this.gender = gender;
        this.superpower = superpower;
        this.weapon = weapon;
    }
}
