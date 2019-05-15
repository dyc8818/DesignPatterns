package BehavioralPattern.ChainOfResponsibility;

public class DebugLogger extends AbstractLogger {


    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String m) {
        System.out.println("Debug Console::Logger: " + m);
    }
}
