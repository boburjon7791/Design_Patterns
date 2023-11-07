package org.example.structural_patterns.flyweight_design_pattern;

public class CounterTerrorist implements Player {
    private final String TASK;
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "+weapon+"|"+" Task is "+TASK);
    }
}
