package CreationalPattern.AbstractFactory;

public class HuaweiFactory implements AbstractFactory{
    @Override
    public InterfacePad producePad() {
        System.out.println("生成华为平板");
        return new HuaweiPad();
    }

    @Override
    public InterfacePhone producePhone() {
        System.out.println("生成华为手机");
        return new HuaweiPhone();
    }
}
