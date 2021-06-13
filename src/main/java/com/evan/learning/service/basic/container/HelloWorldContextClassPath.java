package com.evan.learning.service.basic.container;

import com.evan.learning.model.basic.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldContextClassPath {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic/container/HelloWorldBeans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
