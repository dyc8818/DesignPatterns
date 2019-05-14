package StructuralPattern.Bridge;

public class Abstraction {
        Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    void operation(){
        implementor.operation();
    }
}
