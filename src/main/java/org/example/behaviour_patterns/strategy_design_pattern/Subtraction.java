package org.example.behaviour_patterns.strategy_design_pattern;

public class Subtraction implements Strategy {
    @Override
    public float calculation(float a, float b) {
        return a-b;
    }
}
