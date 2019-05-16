package BehavioralPattern.Strategy;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        Strategy strategy = new OperationAdd();
        Context context = new Context(strategy);
        System.out.println(context.executeStrategy(2,3));

        strategy = new OperationSubstract();
        context = new Context(strategy);
        System.out.println(context.executeStrategy(2,3));
    }
}
