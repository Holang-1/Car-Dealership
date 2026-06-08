package com.holang_and_liyanda;

public class Vehicle {
    private String brand;
    private String model;
    private double price;

    public Vehicle(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getVehicleInfo(){
        return "Brand: "+getBrand() +
                "Model: "+ getModel() +
                "Price: "+ getPrice();
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
