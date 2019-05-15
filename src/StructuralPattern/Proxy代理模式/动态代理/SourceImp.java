package StructuralPattern.Proxy代理模式.动态代理;

public class SourceImp implements SourceInterface {
    @Override
    public void say(String s) {
        System.out.println("我在说:"+s);
    }
}
