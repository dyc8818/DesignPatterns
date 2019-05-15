package BehavioralPattern.Command;

public class ConcreteCommandB implements Command {
    Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doB();
    }
}
