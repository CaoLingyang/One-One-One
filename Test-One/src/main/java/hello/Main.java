package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       EmployeeDao dao= (EmployeeDao) context.getBean("first");
       EmployeeDao dao1=context.getBean("first",EmployeeDao.class);
        System.out.println("dao = " + dao);
        System.out.println("dao1 = " + dao1);
    }
}
