package com.improve10x.tdd.templerun;

import com.improve10x.tdd.templerun.Character;

public class Player extends Character {

    private int score;

    public Player(String name, int health) {
        super(name, health);
        this.score = 0;
    }

    public void run() {
        System.out.println("Running....");
    }

    public void jump() {
        System.out.println(getName() + "Jumped to avoid obstacles");
    }

    public int getScore(){
        return score;
    }

}
