package BehavioralPattern.Observer;

public class ObserverB implements Observer{

    @Override
    public void update(String message) {
        System.out.println("我是B,收到消息："+message);
    }
}
