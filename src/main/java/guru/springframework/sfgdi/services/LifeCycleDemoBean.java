package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I am in the LifeCycleBean Constructor");
        System.out.flush();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set");
        System.out.flush();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean is being destroyed");
        System.out.flush();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## The LifeCycleBean bean name is " + name);
        System.out.flush();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The LifeCycleBean beanFactoryName is " + beanFactory);
        System.out.flush();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The LifeCycleBean applicationContext is being set: " + applicationContext);
        System.out.flush();
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The post-construct of the LifeCycleBean has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The pre-destroy of the LifeCycleBean has been called");
    }
}
