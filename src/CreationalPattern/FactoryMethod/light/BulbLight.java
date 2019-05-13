package CreationalPattern.FactoryMethod.light;

public class BulbLight implements ILight{


    @Override
    public void turnOn() {
        System.out.println("bulb light turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("bulb light turn off");

    }
}
