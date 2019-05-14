package StructuralPattern.Adapter.类适配器;

public class Adaptor extends Adaptee implements Target{


    @Override
    public void method2() {
        System.out.println("我是新加的method2");
    }
}
