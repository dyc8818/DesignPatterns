package CreationalPattern.AbstractFactory;

public class HuaweiPhone implements InterfacePhone{
    @Override
    public void sayPhone() {
        System.out.println("我是华为手机");
    }
}
