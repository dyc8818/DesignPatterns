package CreationalPattern.Singleton.懒汉式;

//线程不安全
public class SingleTon {
    private static SingleTon singleTon;

    private SingleTon() {

    }

    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}

//线程安全,效率低下，不为null时无需加锁
class SingleTon2 {
    private static SingleTon2 singleTon;

    private SingleTon2() {
    }

    public static synchronized SingleTon2 getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon2();
        }
        return singleTon;
    }
}

//双重检验锁
class SingleTon3 {
    private volatile static SingleTon3 singleTon3;

    private SingleTon3() {
    }

    public static SingleTon3 getSingleTon() {
        if (singleTon3 == null) {
            synchronized (SingleTon3.class) {
                if (singleTon3 == null) {
                    singleTon3 = new SingleTon3();
                }
            }
        }
        return singleTon3;
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
