package CreationalPattern.Builder;

public class OfoBuilder implements Builder {
    Bike bike = new Bike();

    @Override
    public void buildTyre() {
        bike.setTyre("黄色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("黄色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("ofo定制版GPS定位装置");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}