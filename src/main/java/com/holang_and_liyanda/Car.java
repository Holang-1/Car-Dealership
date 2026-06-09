package com.holang_and_liyanda;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, double price, String numberPlate, int doors) {
        super(brand, model, price, numberPlate);
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        if (doors > 0) {
            throw new IllegalArgumentException();
        }
        this.doors = doors;
    }

    @Override
    public String getVehicleInfo() {
        // saved the factorial weirdly (review)
        return getBrand() + " " + getModel() + " - R" + String.format("%.2f", getPrice()) + " - " + getNumberPlate() + " - " + doors + " doors";
    }
}
