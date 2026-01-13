package ioc.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationIocLooseCoupling.xml");

        UserManager userManagerWithDB =
                (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithNewDB =
                (UserManager) context.getBean("userManagerWithNewDataBaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

        UserManager userManagerWithWS =
                (UserManager) context.getBean("userManagerWithWebServiceProvider");
        System.out.println(userManagerWithWS.getUserInfo());
    }
}
