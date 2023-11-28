package com.workintech.car.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new ElectricCar("Tesla", "Electrical Car",
                100, 4);

        System.out.println(carSkeleton.drive());
    }
}
