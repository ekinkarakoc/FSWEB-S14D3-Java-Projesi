package com.workintech.car.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car( int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine() {
        System.out.println("Class : " + getClass().getSimpleName());
        return "The car's engine is starting";
    }

    public String accelerate(){
        System.out.println("Class : " + getClass().getSimpleName());
        return "The car is accelerating";
    }

    public String brake(){
        System.out.println("Class : " + getClass().getSimpleName());
        return "The car is breaking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


}
