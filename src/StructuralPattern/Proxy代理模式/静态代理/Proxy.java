package StructuralPattern.Proxy代理模式.静态代理;

public class Proxy implements SourceInterface {
    SourceImp sourceImp;
    Proxy(){
        sourceImp = new SourceImp();
    }
    @Override
    public void say() {
        System.out.println("before");
        sourceImp.say();
        System.out.println("after");
    }
}
