package org.springfromscratch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private GearBox gearBox;
    private Engine engine;

    Car() {
        System.out.println("Car is being instantiated with nothing!");
        gearBox = new GearBox();
        engine = new Engine();
    }
    Car(Engine engine, GearBox gearBox) {
        System.out.println("Car is being instantiated with Engine and GearBox!");
        this.gearBox = gearBox;
        this.engine = engine;
    }
    @Autowired(required = false)
    Car(Engine engine) {
        System.out.println("Car is being instantiated with Engine");
        this.gearBox = new GearBox();
        this.engine = engine;
    }
    @Autowired(required = false)
    Car(GearBox gearBox) {
        System.out.println("Car is being instantiated with GearBox!");
        this.gearBox = gearBox;
        this.engine = new Engine();
    }

    @Autowired
    public void setGearBox(GearBox gearBox) {
        System.out.println("Setting Gearbox");
        this.gearBox = gearBox;
    }

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
//        engine.ignite();
//        gearBox.gearUp();
    }
}
