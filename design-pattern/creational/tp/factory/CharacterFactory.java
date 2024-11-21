package org.example.creational.tp.factory;

public class CharacterFactory {

    public Character getCharacter(String type, String name) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("Archer")) return  new Archer(name);
        if (type.equalsIgnoreCase("Mage")) return  new Mage(name);
        if (type.equalsIgnoreCase("Warrior")) return  new Warrior(name);
        return  null;
    }
}
