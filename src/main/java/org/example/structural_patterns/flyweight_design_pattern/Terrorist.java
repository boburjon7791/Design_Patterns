package org.example.structural_patterns.flyweight_design_pattern;

public class Terrorist implements Player {
    private final String TASK;

    private String weapon;
    public Terrorist() {
        TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon "+weapon+"|"+" Task is "+TASK);
    }
}
