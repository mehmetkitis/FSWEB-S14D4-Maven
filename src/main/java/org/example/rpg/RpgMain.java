package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll(100,"Shrek",1000);
        Monster wolf = new Werewolf(100,"wolf",500);
        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack result of: " + monster.getName() + ": " +monster.attack());
    }
}
