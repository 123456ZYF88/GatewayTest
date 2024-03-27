package com.gateway.demo.customizable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * Spring自定义某些操作
 *
 * @author zhangyf
 * @date 2024/3/27 14:14
 */

public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // 在容器刷新完成后执行的操作
        System.out.println("在容器刷新完成后执行的操作");
        // 可以在这里添加任何你需要的初始化逻
        String[] beanDefinitionNames = applicationContext.getBeanFactory().getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
    }
}
