package BehavioralPattern.Observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    ArrayList<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer:observers){
            observer.update(message);
        }
    }
}
