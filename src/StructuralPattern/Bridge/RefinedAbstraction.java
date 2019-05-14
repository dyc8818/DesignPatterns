package StructuralPattern.Bridge;

public class RefinedAbstraction extends Abstraction {
    @Override
    void operation() {
        //super.operation();
        //getImplementor().operation();
        super.getImplementor().operation();
    }
}
