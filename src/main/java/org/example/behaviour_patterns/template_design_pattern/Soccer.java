package org.example.behaviour_patterns.template_design_pattern;

public class Soccer extends Game {
    @Override
    void initialize() {
        System.out.println("Soccer game initialized! Start playing");
    }

    @Override
    void start() {
        System.out.println("Game started! Welcome to in the soccer game");
    }

    @Override
    void end() {
        System.out.println("Game finished");
    }
}
