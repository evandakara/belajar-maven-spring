package com.evan.learning.model.basic;

public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // this method will call when we are defining property init-method in spring bean declaration
    public void init() {
        System.out.println("Bean through init");
    }

    // this method will call when we are defining property destroy-method in spring bean declaration
    public void destroy() {
        System.out.println("Bean will be destroyed");
    }
}
