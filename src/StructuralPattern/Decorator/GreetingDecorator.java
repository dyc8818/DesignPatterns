package StructuralPattern.Decorator;

public abstract class GreetingDecorator implements Greeting {
    private Greeting greeting;

    public GreetingDecorator(Greeting greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayHello(String name) {
        greeting.sayHello(name);
    }
}
