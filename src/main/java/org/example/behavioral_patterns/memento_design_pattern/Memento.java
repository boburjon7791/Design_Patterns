package org.example.behavioral_patterns.memento_design_pattern;

public class Memento {
    private final String state;
    public Memento(String state){
        this.state=state;
    }
    public String getState(){
        return this.state;
    }
}
