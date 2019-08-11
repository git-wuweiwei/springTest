package com.test;

import com.legend.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {

    @Test
    public void test1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanx.xml");


        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.add();

    }

}
