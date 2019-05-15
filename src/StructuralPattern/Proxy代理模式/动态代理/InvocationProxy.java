package StructuralPattern.Proxy代理模式.动态代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationProxy<T> implements InvocationHandler {
    T target;

    public InvocationProxy(T target) {

        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(target,args);
        System.out.println("after");
        return result;
    }
}
