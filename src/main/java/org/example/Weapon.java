package org.example;

import java.lang.reflect.Constructor;

public abstract class Weapon {
    public String name;
    public int power;
//   Constructor
    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }
}