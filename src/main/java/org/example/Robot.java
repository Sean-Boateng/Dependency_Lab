package org.example;
import org.example.Weapon;


public class Robot implements Attacker{

    public String name;

    public Weapon weapon;



//    Constructor
    public Robot(Weapon weapon) {
        this.name = "Robo";
        this.weapon= weapon;
    }

//    Method
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name+ " for " + this.weapon.power + " damage");
    }



}
