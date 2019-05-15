package BehavioralPattern.Observer;

public class ObserverA implements Observer{

    @Override
    public void update(String message) {
        System.out.println("我是A,收到消息："+message);
    }
}
