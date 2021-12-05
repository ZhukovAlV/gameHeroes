package com.company;

public class Test {

    public static void main(String[] args) {

        Hero spiderMan = new Hero("Питер Паркер", 16.0, 60, 90,
                'м', "Паутина", new MagicWeapon("Химическое оружие", 70));


        spiderMan.say();
        System.out.println(spiderMan.weapon.name);

        spiderMan.weapon.shoot();

/*        Hero spiderMan = new Hero();
        spiderMan.name = "Питер Паркер";
        spiderMan.age = 16;

        Weapon spiderManWeapon = new Weapon();
        spiderManWeapon.name = "Паутина";
        spiderMan.weapon = spiderManWeapon;

        spiderMan.say();

        // Выводится в консоль значение переменной
        System.out.println(spiderManWeapon.name);

        Hero hulk = new Hero();
        hulk.name = "Халк";

        Weapon hulkWeapon = new Weapon();
        hulkWeapon.name = "Физическое оружие";
        hulk.weapon = hulkWeapon;

        hulk.say();
        System.out.println(hulk.relationToWorld);

        Villain venom = new Villain();
        venom.name = "Веном";

        Weapon venomWeapon = new Weapon();
        venomWeapon.name = "Симбиоз";
        venom.weapon = hulkWeapon;

        venom.say();
        System.out.println(venom.relationToWorld);*/

    }
}
