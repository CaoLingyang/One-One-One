package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext_lifecycle.xml");
//        EmployeeLifeCylcle1 dao1=context.getBean("daoLife2",EmployeeLifeCylcle1.class);

        EmployeeLifeCylcle dao=context.getBean("daoLife",EmployeeLifeCylcle.class);

        ((ConfigurableApplicationContext)context).close();
    }
}
