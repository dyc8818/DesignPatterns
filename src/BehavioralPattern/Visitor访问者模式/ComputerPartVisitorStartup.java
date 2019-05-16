package BehavioralPattern.Visitor访问者模式;

public class ComputerPartVisitorStartup implements  ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        computer.startup();
    }

    @Override
    public void visit(Mouse mouse) {
        mouse.startup();
    }

    @Override
    public void visit(Keyboard keyboard) {
        keyboard.startup();
    }

    @Override
    public void visit(Monitor monitor) {
       monitor.startup();
    }
}
