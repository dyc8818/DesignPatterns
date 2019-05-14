package CreationalPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        InterfacePad pad = factory.producePad();
        InterfacePhone phone =factory.producePhone();
        pad.sayPad();
        phone.sayPhone();

         factory = new HuaweiFactory();
         pad = factory.producePad();
         phone =factory.producePhone();
        pad.sayPad();
        phone.sayPhone();

    }
}
