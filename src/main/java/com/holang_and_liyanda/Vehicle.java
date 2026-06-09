package com.holang_and_liyanda;

public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private final String numberPlate;

    public Vehicle(String brand, String model, double price, String numberPlate){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.numberPlate = numberPlate;
    }

    public String getVehicleInfo(){
        return getBrand() + " "+
                getModel() +" - "+
                "R"+ String.format("%.2f",getPrice());
    }


    public String getNumberPlate() {
        return numberPlate;
    }
    public double getPrice() {
        return price;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
