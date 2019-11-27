package dynamic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext_dynamic.xml");
        DynamicRegistrator registrator=context.getBean("registrator",DynamicRegistrator.class);
        B b=registrator.register("b",B.class);
        System.out.println("b = " + b);
        B b1=context.getBean("b",B.class);
        System.out.println("b1 = " + b1);
        System.out.println(b==b1);
    }
}
