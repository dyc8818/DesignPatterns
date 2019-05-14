package StructuralPattern.Adapter.对象适配器;

public class Adaptor implements Target {
    Adaptee adaptee;
    public Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("我是method2");
    }
}
