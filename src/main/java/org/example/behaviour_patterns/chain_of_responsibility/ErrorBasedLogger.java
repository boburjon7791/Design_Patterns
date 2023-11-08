package org.example.behaviour_patterns.chain_of_responsibility;

public class ErrorBasedLogger extends Logger {
    public ErrorBasedLogger(int levels){
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String message) {
        System.out.println("Error logger info: "+message);
    }
}
