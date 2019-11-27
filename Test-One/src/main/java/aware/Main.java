package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext_aware.xml");
        SomeBean someBean=context.getBean("SomeBean",SomeBean.class);
        ApplicationContext context2=someBean.getContext();
        System.out.println(context==context2);
    }

}
