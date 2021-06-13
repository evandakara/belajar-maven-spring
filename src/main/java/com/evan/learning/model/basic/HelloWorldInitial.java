package com.evan.learning.model.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorldInitial implements BeanPostProcessor {
    HelloWorldProcessor helloWorldProcessor = new HelloWorldProcessor();

    public Object postProcessBeforeInitialization(Object obj, String beanName) throws BeansException {

        System.out.println("Before initialization: " + beanName);
//        helloWorldProcessor.setValue("Value from HelloWorldProcessor before init");
//        helloWorldProcessor.getValue();
        if (obj instanceof HelloWorld) {
            ((HelloWorld) obj).getMessage();
        } else if (obj instanceof HelloWorldProcessor) {
            ((HelloWorldProcessor) obj).getValue();
        }
        return obj;
    }

    public Object postProcessAfterInitialization(Object obj, String beanName) throws BeansException {
        System.out.println();
        System.out.println("After initialization" + beanName);
        System.out.println("Delete message from bean helloWorld, now set value to helloWorldProcessor");
        if (obj instanceof HelloWorld) {
            ((HelloWorld) obj).setMessage(null);
        } else if (obj instanceof HelloWorldProcessor) {
            ((HelloWorldProcessor) obj).getValue();
        }
        helloWorldProcessor.setValue("New value from postProcessAfterInitialization");
        helloWorldProcessor.getValue();
        return obj;
    }
}
