package BehavioralPattern.Command;

public class ConcreteCommandA implements Command {
    Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doA();
    }
}
