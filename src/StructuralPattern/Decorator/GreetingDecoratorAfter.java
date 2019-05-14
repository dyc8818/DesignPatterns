package StructuralPattern.Decorator;

public class GreetingDecoratorAfter extends GreetingDecorator {
    public GreetingDecoratorAfter(Greeting greeting) {
        super(greeting);
    }

    @Override
    public void sayHello(String name) {
        super.sayHello(name);
        System.out.println("after");
    }
}
