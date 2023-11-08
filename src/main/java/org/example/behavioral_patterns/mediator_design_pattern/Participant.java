package org.example.behavioral_patterns.mediator_design_pattern;

public abstract class Participant {
    public abstract void sendMessage(String msg);
    public abstract void setName(String name);
    public abstract String getName();
}
