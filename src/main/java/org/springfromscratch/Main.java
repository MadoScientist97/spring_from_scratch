package org.springfromscratch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        printHeading();

        var di = new AnnotationConfigApplicationContext("org.springfromscratch");

        var car = di.getBean(Car.class);
        System.out.println("Car instance: " + car);

        printBeanDefinition(di);
    }

    private static void printBeanDefinition(AnnotationConfigApplicationContext di) {
        System.out.println("\n\n##################BeanDefinitions:######################");
        for (String name: di.getBeanDefinitionNames()) {
            if (name.contains("org.springframework"))
                continue;

            var beanDef = di.getBeanDefinition(name);
            var type = beanDef.getBeanClassName();

            System.out.println("Bean Definition:\n"+
                    "Name: " + name + "\n" +
                    "Type: " + type + "\n" +
                    "-----------------------------------------");
        }
    }

    private static void printHeading() {
        System.out.println("========================Spring Application============================");
    }
}
