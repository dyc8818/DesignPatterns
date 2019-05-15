package BehavioralPattern.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void runCommand(){
        command.execute();
    }
}
