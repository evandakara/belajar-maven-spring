package com.evan.learning.service.basic.lifecycle;

import com.evan.learning.model.basic.HelloWorld;
import com.evan.learning.model.basic.HelloWorldProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldLifecycle {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic.lifecycle/HelloWorldLifecycle.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}
