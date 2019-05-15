package StructuralPattern.Proxy代理模式.静态代理;

public class Client {
    public static void main(String[] args) {
        SourceInterface proxy = new Proxy();
        proxy.say();
    }
}
