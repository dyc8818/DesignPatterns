package BehavioralPattern.Observer;

public class ObserverC implements Observer{

    @Override
    public void update(String message) {
        System.out.println("我是C,收到消息："+message);
    }
}
