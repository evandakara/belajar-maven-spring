package com.evan.learning.model.basic;

import javax.swing.*;
import java.io.Serializable;

public class HelloWorldProcessor implements Serializable {
    private String value;

    public void getValue() {
        System.out.println("value from processor : " + value);
    }

    public void setValue(String message) {
        this.value = message;
    }

    public void init() {
        System.out.println("Bean through init");
        this.value = "Value from HelloWorldProcessor when init";
    }
}
