package CreationalPattern.Builder;

public interface Builder {

    public void buildTyre();
    public void buildFrame();

    public void buildGps();

    // 获取自行车
    public Bike getBike();
}
