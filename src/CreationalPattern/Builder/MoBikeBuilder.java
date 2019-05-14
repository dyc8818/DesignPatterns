package CreationalPattern.Builder;

public class MoBikeBuilder implements Builder {
    Bike bike = new Bike();

    @Override
    public void buildTyre() {
        bike.setTyre("橙色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    @Override
    public void buildGps() {
        bike.setGps("mobike定制版GPS定位装置");
    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
