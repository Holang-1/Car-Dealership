package com.holang_and_liyanda;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String numberPlate;

    public Vehicle(String brand, String model, double price, String numberPlate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.numberPlate = numberPlate;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    public String getVehicleInfo() {
        return  brand +  " " + model + " - R" + price + " - 4 doors";
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        if (numberPlate.length() > 10) {
            throw new IllegalArgumentException();
        }
        this.numberPlate = numberPlate;
    }
}

