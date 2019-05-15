package StructuralPattern.Proxy代理模式.静态代理;

public class SourceImp implements SourceInterface {
    @Override
    public void say() {
        System.out.println("我在说话");
    }
}
