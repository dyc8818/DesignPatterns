package BehavioralPattern.Visitor访问者模式;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
    public void startup();
}
