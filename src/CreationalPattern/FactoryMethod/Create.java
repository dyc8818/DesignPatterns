package CreationalPattern.FactoryMethod;

import CreationalPattern.FactoryMethod.factory.BulbFactory;
import CreationalPattern.FactoryMethod.factory.IFactory;
import CreationalPattern.FactoryMethod.factory.TubeFactory;
import CreationalPattern.FactoryMethod.light.ILight;

public class Create {
    public static void main(String[] args) {
        IFactory factory = new BulbFactory();
        ILight light = factory.createLight();
        light.turnOn();
        light.turnOff();

        factory = new TubeFactory();

        light = factory.createLight();
        light.turnOn();
        light.turnOff();

    }
}
