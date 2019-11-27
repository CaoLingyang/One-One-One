package inject.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext_basic.xml");
        UserInfo userInfo= (UserInfo) context.getBean("");
        DbConfig config=context.getBean("dbConfig",DbConfig.class);
        System.out.println("config = " + config);
    }
}
