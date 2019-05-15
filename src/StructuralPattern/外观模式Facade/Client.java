package StructuralPattern.外观模式Facade;

public class Client {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startup();
        computerFacade.shutdown();
    }
}
