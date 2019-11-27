package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext context;
    @Override
    public void setBeanName(String name) {

    }

    public void XXX(){

    }

    public ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
         this.context=context;
    }
}
