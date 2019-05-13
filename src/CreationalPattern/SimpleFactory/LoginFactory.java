package CreationalPattern.SimpleFactory;

public class LoginFactory {
    public static Login factory(String type){
        if(type.equals("password")){

            return new PasswordLogin();

        }else if(type.equals("domain")){

            return new DomainLogin();

        }else{
            /**
             * 这里抛出一个自定义异常会更恰当
             */
            throw new RuntimeException("没有找到登录类型");
        }
    }

    public static void main(String[] args) {
        LoginFactory loginFactory = new LoginFactory();
        Login login = loginFactory.factory("password");
        login.verify("a","b");
    }
}
