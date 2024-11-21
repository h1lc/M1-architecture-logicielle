package org.example.creational.tp.factory;

public class Warrior implements Character{
    private String name;
    Warrior(String _name) {
        name = _name;
    }

    @Override
    public int getAttack() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("I am Warrior");
    }
}
