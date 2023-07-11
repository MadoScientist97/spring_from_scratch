package org.springfromscratch;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Car() {
        System.out.println("Car is being instantiated with nothing!");
    }
}
