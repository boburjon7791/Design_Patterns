package org.example.behavioral_patterns.chain_of_responsibility;

public class ConsoleBasedLogger extends Logger {
    public ConsoleBasedLogger(int levels){
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Console logger info: "+message);
    }
}
