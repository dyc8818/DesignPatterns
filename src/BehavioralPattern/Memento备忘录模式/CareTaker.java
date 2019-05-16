package BehavioralPattern.Memento备忘录模式;

import java.util.HashMap;

public class CareTaker {
    HashMap<Originator,Memento> map = new HashMap<>();
    public void setMemento(Originator originator,Memento memento){
        map.put(originator,memento);
    }

    public Memento getMemento(Originator originator){
        return map.get(originator);
    }
}
