package org.example.creational.tp.factory;

public class Archer implements  Character{

    private String name;
    Archer(String _name) {
        name = _name;
    }

    @Override
    public int getAttack() {
        return 5;
    }

    @Override
    public int getHealth() {
        return 60;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("I am Archer");
    }
}
