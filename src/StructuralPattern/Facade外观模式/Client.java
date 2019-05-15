package StructuralPattern.Facade外观模式;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startup();
        computerFacade.shutdown();
    }
}
