package BehavioralPattern.ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String m) {
        System.out.println("Standard Console::Logger: " + m);
    }
}
