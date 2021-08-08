package com.kiranmetz;

public class Characters {

    int health;
    int ability;
    int mana;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

class CharacterTypes extends  Characters {
    String[] characterTypes = {"Warrior", "Wizard", "Elf" ,"Demon"};


}
