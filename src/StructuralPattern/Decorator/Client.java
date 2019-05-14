package StructuralPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Greeting greeting =new  GreetingDecoratorAfter(new GreetingDecoratorBefore(new GreetingImp()));
        greeting.sayHello("dy");

    }
}
