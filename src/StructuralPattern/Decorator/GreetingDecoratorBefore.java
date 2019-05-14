package StructuralPattern.Decorator;

public class GreetingDecoratorBefore extends GreetingDecorator {
    public GreetingDecoratorBefore(Greeting greeting) {
        super(greeting);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("before");
        super.sayHello(name);
    }
}
