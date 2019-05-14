package CreationalPattern.Builder;

public class Director {
    public static Bike buildBike(Builder builder){
        builder.buildFrame();
        builder.buildGps();
        builder.buildTyre();
        return builder.getBike();
    }
}
