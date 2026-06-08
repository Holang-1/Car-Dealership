package com.holang_and_liyanda;

public class Vehicle {
    private String brand;
    private String model;
    private double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand() {

    }

    public String getModel() {
        return this.model;
    }
}
