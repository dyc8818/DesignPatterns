package BehavioralPattern.State;

public class EmptyState implements State{
    @Override
    public void press() {
        System.out.println("水桶空了，无法流出水");
    }
}
