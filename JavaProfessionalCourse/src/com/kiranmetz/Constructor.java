package com.kiranmetz;

public class Constructor {

    String name;
    float damage = 50f;

    Constructor(String name, float damage) {
        this.name = name;
        this.damage = damage;
        System.out.println(name + ", damage: " + damage);
    }

    int GetDoubleDamage (){
        return (int) (damage * 2);
    }

    public static void main (String [] args) {
        Constructor myName = new Constructor("Kiran", 5f);
        Constructor myOtherName = new Constructor("Kazuha", 10f);
        System.out.println( myName.name + ", Double Damage: " + myName.GetDoubleDamage());

    }
}
