package org.example.behaviour_patterns.chain_of_responsibility;

public class DebugBasedLogger extends Logger {
    public DebugBasedLogger(int levels){
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Debug logger info: "+message);
    }
}
