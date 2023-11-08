package org.example.behavioral_patterns.state_design_pattern;

public class Sales implements Connection {
    @Override
    public void open() {
        System.out.println("Open database for sales");
    }

    @Override
    public void close() {
        System.out.println("Close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Sales has been updated");
    }
}
