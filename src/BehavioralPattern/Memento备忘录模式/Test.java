package BehavioralPattern.Memento备忘录模式;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator(1);
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator,originator.createMemento());
        originator.setState(2);
        System.out.println(originator.getState());
        originator.restore(careTaker.getMemento(originator));
        System.out.println(originator.getState());

    }
}
