package StructuralPattern.FlyweightPattern享元模式;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public Circle getCircle(String color){
        Circle circle = circleMap.get(color);
        if(circle==null){
            circle = new Circle(color);
            circleMap.put(color,circle);
        }
        return circle;
    }
}
