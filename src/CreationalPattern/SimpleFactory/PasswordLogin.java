package CreationalPattern.SimpleFactory;

public class PasswordLogin implements Login{
    @Override
    public boolean verify(String name, String password) {
        // TODO Auto-generated method stub
        /**
         * 业务逻辑
         */
        System.out.println("我是password Login");
        return true;
    }
}
