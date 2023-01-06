
package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Laser laser = new Laser();
        Sword sword = new Sword();
        Axe axe = new Axe();
        Robot robot_one = new Robot(axe);
        Robot robot_two = new Robot(sword);
        Robot robot_three = new Robot(laser);
        System.out.println(robot_one.name);
        robot_one.Attack();
        robot_three.Attack();
        robot_two.Attack();
    }
}

