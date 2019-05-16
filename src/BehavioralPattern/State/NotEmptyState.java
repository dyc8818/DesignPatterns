package BehavioralPattern.State;

public class NotEmptyState implements State {
    @Override
    public void press() {
        System.out.println("水桶不空，水正在流");
    }
}
