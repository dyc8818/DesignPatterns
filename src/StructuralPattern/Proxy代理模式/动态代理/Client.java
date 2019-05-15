package StructuralPattern.Proxy代理模式.动态代理;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        SourceInterface sourceImp = new SourceImp();
        InvocationProxy<SourceInterface> interfaceInvocationProxy = new InvocationProxy<>(sourceImp);
        SourceInterface proxy = (SourceInterface) Proxy.newProxyInstance(sourceImp.getClass().getClassLoader(),sourceImp.getClass().getInterfaces(),interfaceInvocationProxy);
        proxy.say("哈哈哈");
    }
}
