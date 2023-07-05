package org.springfromscratch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var di = new AnnotationConfigApplicationContext("org.springfromscratch");
        for (String s: di.getBeanDefinitionNames()) {
            if (!s.contains("org.springframework")) {
                var beanDef = di.getBeanDefinition(s);
                System.out.println("Beans: " + s + "\nHas type of: " + beanDef.getBeanClassName());
            }
        }
        var car = di.getBean(Car.class);
        System.out.println("Car instance: " + car);
    }
}
