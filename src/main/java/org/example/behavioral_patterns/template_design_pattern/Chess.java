package org.example.behavioral_patterns.template_design_pattern;

public class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Chess game initialized! Start playing");
    }

    @Override
    void start() {
        System.out.println("Game started! Welcome to in the chess game");
    }

    @Override
    void end() {
        System.out.println("Game finished");
    }
}
