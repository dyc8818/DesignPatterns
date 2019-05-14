package CreationalPattern.AbstractFactory;

public class AppleFactory implements AbstractFactory {
    @Override
    public InterfacePad producePad() {
        System.out.println("生成苹果平板");
        return new IPad();
    }

    @Override
    public InterfacePhone producePhone() {
        System.out.println("生成苹果手机");
        return new IPhone();
    }
}
