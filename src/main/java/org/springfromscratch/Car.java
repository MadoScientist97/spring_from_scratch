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

    @Autowired
    public void setGearBox(GearBox gearBox) {
        System.out.println("Setting Gearbox from Method");
        this.gearBox = gearBox;
    }

    @Autowired
    public void setEngine(Engine engine) {
        System.out.println("Setting Engine from method!");
        this.engine = engine;
    }

    public void start() {
//        engine.ignite();
//        gearBox.gearUp();
    }
}
