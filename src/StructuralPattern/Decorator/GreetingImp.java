package StructuralPattern.Decorator;

public class GreetingImp implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello!"+name);
    }
}
