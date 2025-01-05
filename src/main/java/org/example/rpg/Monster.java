package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(double damage, String name, int hitPoints) {
        this.damage = damage;
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public abstract double attack();

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
