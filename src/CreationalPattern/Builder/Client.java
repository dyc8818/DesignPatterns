package CreationalPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Builder moBikeBuilder = new MoBikeBuilder();
        Bike bike  = Director.buildBike(moBikeBuilder);
        System.out.println(bike);
        Builder ofoBuilder = new OfoBuilder();
        bike  = Director.buildBike(ofoBuilder);
        System.out.println(bike);
    }
}
