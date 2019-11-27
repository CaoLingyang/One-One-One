package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeLifeCylcle1 implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set: 初始化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy---");
    }
}
