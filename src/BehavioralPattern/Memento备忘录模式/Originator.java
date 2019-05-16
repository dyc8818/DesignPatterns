package BehavioralPattern.Memento备忘录模式;

public class Originator {
    private int state;

    public Originator(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    Memento createMemento(){
        return new Memento(this.state);
    }

    void restore(Memento memento){
        setState(memento.getState());
    }
}
