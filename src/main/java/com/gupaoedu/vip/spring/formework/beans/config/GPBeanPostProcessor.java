package com.gupaoedu.vip.spring.formework.beans.config;

/**
 * Created by yzy
 */
public class GPBeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

}
