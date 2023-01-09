
package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Laser laser = new Laser();
        Sword sword = new Sword();
        Axe axe = new Axe();
        Attacker wolf_one = new Werewolf("oz",77);
        Robot robot_one = new Robot(axe);
        Robot robot_two = new Robot(sword);
        Robot robot_three = new Robot(laser);
        System.out.println(robot_one.name);
        wolf_one.Attack();
//        robot_one.Attack();
//        robot_three.Attack();
//        robot_two.Attack();
    }
}

