package com.gupaoedu.vip.spring.formework.context.support;

/**
 * IOC容器实现的顶层设计
 * Created by yzy.
 */
public abstract class GPAbstractApplicationContext {

    //受保护，只提供给子类重写
    public void refresh() throws Exception {}

}
