package org.example.behavioral_patterns.chain_of_responsibility;

public abstract class Logger {
    public static int OUTPUT_INFO=1;
    public static int ERROR_INFO=2;
    public static int DEBUG_INFO=3;
    protected int levels;
    protected Logger nextLevelLogger;
    public void setNextLevelLogger(Logger logger){
        this.nextLevelLogger=logger;
    }
    public void logMessage(int levels, String message){
        if(this.levels<=levels){
            displayLogInfo(message);
        }
        if(nextLevelLogger!=null){
            nextLevelLogger.logMessage(levels, message);
        }
    }
    protected abstract void displayLogInfo(String message);
}
