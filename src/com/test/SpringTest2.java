package com.test;

import com.legend.model.User;
import com.legend.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest2 {

    @Test
    public void test1(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans2.xml");


        User user = (User) applicationContext.getBean("user");

        System.out.println(user);


    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
