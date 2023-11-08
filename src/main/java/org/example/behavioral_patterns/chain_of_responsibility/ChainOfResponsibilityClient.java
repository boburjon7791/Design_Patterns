package org.example.behavioral_patterns.chain_of_responsibility;

public class ChainOfResponsibilityClient {
    public static Logger doChaining(){
        Logger consoleLog=new ConsoleBasedLogger(Logger.OUTPUT_INFO);

        Logger errorLog=new ErrorBasedLogger(Logger.ERROR_INFO);
        consoleLog.setNextLevelLogger(errorLog);

        Logger debugLog=new DebugBasedLogger(Logger.DEBUG_INFO);
        errorLog.setNextLevelLogger(debugLog);

        return consoleLog;
    }
    public static void main(String[] args) {
        Logger logger = doChaining();
        logger.logMessage(Logger.OUTPUT_INFO,"Enter the sequence of values");
        logger.logMessage(Logger.ERROR_INFO,"An error is occurred now");
        logger.logMessage(Logger.DEBUG_INFO,"This was the error now debugging is completed");
    }
}
