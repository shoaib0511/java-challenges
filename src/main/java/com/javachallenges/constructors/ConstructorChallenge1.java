package com.javachallenges.constructors;

@SuppressWarnings(value = "all")
public class ConstructorChallenge1 {
    public static void main(String... doYourBest) {
        Simpson simpson = new Simpson("Bart", 8);
        System.out.println(simpson.name + "," + simpson.age);
    }
    static abstract class Character {
        String name;
        int age = 35;
        static { System.out.println("D'oh"); }
        Character(String name, int age) {
            this.name = "Homer";
            this.age = this.age;
            System.out.println("c2");
        }
    }
    static class Simpson extends Character {
        Simpson(String name, int age) {
            super(name, age);
            System.out.println("c1");
        }
    }
}