package StructuralPattern.FlyweightPattern享元模式;

public class Client {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        Circle circle = circleFactory.getCircle("red");
        Circle circle2 = circleFactory.getCircle("green");
        Circle circle3 = circleFactory.getCircle("red");
        circle.draw();
        circle2.draw();
        circle3.draw();
        System.out.println(circle==circle3);
    }
}
