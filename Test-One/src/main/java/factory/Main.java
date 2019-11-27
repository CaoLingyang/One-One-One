package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext_factory.xml");
        A instance=context.getBean("factory3",A.class);
        System.out.println(instance.getClass().getName());
    }
}