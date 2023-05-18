package com.example.demo.apps;

import com.example.demo.beans.MyBeanAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo")
public class AutoConfigurationContextApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfigurationContextApp.class);

        MyBeanAutoConfiguration myBeanAutoConfiguration = context.getBean("myBeanAutoConfiguration", MyBeanAutoConfiguration.class);

        System.out.println(myBeanAutoConfiguration);

    }
}
