public class Main {
    // static Main main = new Main();
    private static class innerClass {
        static final Main main = new Main();
        static {
            System.out.println("我是静态内部类");
        }
    }

    {
        System.out.println("我是构造代码块");
    }

    Main() {
        System.out.println("我是Main");
    }

    static {
        System.out.println("我是静态代码快");
    }

    public static void main(String[] args) {

        new Main();
        System.out.println("------------");
        new Main();
        System.out.println("------------");
        System.out.println(
                innerClass.main);
    }
}
