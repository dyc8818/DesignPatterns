package BehavioralPattern.Command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommandA commandA = new ConcreteCommandA(receiver);
        ConcreteCommandB commandB = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker(commandA);
        invoker.runCommand();

        invoker = new Invoker(commandB);
        invoker.runCommand();

    }
}
