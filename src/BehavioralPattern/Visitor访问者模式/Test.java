package BehavioralPattern.Visitor访问者模式;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartVisitorStartup computerPartVisitorDisplaying = new ComputerPartVisitorStartup();
        computer.accept(computerPartVisitorDisplaying);
        new Mouse().accept(computerPartVisitorDisplaying);
    }
}
