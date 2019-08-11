package com.test;

import com.legend.model.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {

    @Test
    public void test(){

        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("beans3.xml");

        Customer customer = (Customer) applicationContext.getBean("customer");

        System.out.println(customer);
        System.out.println(customer.getAge());
        System.out.println(customer.toString());
    }

}
