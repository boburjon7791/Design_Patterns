package org.example.behavioral_patterns.template_design_pattern;

public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();
    public final void play(){
        initialize();
        start();
        end();
    }
}
