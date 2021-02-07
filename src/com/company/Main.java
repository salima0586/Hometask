package com.company;

public class Main {

    public static void main(String[] args) {
	Boss ugly = new Boss();
	ugly.setBossHealth(800);
	ugly.setBossDamage(75);
	ugly.setBossDefenceType("Fight!");
        System.out.println(ugly.getBossHealth()+" "+ugly.getBossDamage()+" "+ugly.getBossDefenceType());

    }
}
