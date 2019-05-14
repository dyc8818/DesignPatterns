package StructuralPattern.Bridge;

public class Client {
    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreateImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreateImplementorB());
        abstraction.operation();
    }

}
