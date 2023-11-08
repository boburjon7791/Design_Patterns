package org.example.behaviour_patterns.state_design_pattern;

public interface Connection {
    void open();
    void close();
    void log();
    void update();
}
