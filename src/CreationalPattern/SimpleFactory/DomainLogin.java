package CreationalPattern.SimpleFactory;

public class DomainLogin implements Login {

    @Override
    public boolean verify(String name, String password) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("我是Domain");
        return true;
    }
}

