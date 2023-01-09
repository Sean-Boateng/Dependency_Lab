package org.example;

import java.lang.reflect.Constructor;

public class Werewolf implements Attacker{
    public String name;
    public int attackpower;

//    Constructor
    public Werewolf(String name, int attackpower) {
        this.name = name;
        this.attackpower = attackpower;
    }


    public void Attack() {
        System.out.println(this.name + " attacks" +" with "+ this.attackpower + " damage");
    }
}
