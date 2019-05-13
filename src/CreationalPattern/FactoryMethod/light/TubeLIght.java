package CreationalPattern.FactoryMethod.light;

public class TubeLIght implements ILight {
    @Override
    public void turnOn() {
        System.out.println("tube light turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("tube light turn off");

    }
}
