package org.example.creational.tp.factory;

public class Mage implements Character{

    private String name;
    Mage(String _name) {
        name = _name;
    }

    @Override
    public int getAttack() {
        return 15;
    }

    @Override
    public int getHealth() {
        return 30;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("I am Mage");
    }
}
