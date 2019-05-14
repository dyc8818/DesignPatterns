package CreationalPattern.Singleton.饿汉式;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}

    private Singleton getSingleton(){
        return singleton;
    }
}
