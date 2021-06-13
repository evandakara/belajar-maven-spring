package com.evan.learning.service.basic.container;

import com.evan.learning.model.basic.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldContextFile {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\62812\\Documents\\Programming\\belajar-maven-spring\\src\\main\\resources\\HelloWorldBeans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
