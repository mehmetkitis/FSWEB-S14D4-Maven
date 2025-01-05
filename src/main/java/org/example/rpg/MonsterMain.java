package org.example.rpg;

public class MonsterMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek",1000,100);
        Monster wolf = new Werewolf("wolf",500,100);
        printAttackResult(shrek);
        printAttackResult(wolf);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack result of: " + monster.getName() + ": " +monster.attack());
    }
}
