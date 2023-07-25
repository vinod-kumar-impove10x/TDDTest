package com.improve10x.tdd.templerun;

public class Player {
    private String name;
    private int health;
    public Player(String name) {
        this.name = name == null ? "" : name.trim();
        this.health = 100;
    }

    public Player(String name, int health) {
        if (health < 0 || health > 100) {
            throw new InvalidHealthException();
        } else {
            this.health = health;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void run() {
        System.out.println("Running...!");
    }

    public int getScore() {
        return 0;
    }

    public class InvalidHealthException extends RuntimeException {
    }
}
