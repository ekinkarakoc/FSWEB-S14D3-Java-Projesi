package com.workintech.car.arge;

public class HybridCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double averageKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
