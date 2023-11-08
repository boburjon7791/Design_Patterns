package org.example.behaviour_patterns.state_design_pattern;

public class Accounting implements Connection {
    @Override
    public void open() {
        System.out.println("Open database for accounting");
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
        System.out.println("Accounting has been updated");
    }
}
