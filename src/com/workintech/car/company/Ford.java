package com.workintech.car.company;

public class Ford extends Car {

    private long justFord;

    public Ford( int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + "is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + "is breaking";

    }

}
