package BehavioralPattern.Observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        ObserverC observerC = new ObserverC();
        subject.add(observerA);
        subject.add(observerB);
        subject.add(observerC);
        subject.notifyObservers("啦啦");
    }
}
