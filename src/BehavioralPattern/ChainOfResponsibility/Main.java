package BehavioralPattern.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        AbstractLogger loggerChain = LoggerChain();

        loggerChain.logMessage(AbstractLogger.INFO,"123");
        System.out.println("------------------------------------------");
        loggerChain.logMessage(AbstractLogger.DEBUG,"456");
        System.out.println("------------------------------------------");
        loggerChain.logMessage(AbstractLogger.ERROR,"789");
    }
    static AbstractLogger LoggerChain(){
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        consoleLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }
}
