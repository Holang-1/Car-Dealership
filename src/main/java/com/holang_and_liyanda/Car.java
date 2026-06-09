package com.holang_and_liyanda;

public class Car extends Vehicle{
    private int doors;
    public Car(String brand, String model, double price,int doors){
        super(brand, model, price);
        this.doors = doors;
    }


    @Override
    public String getVehicleInfo(){
        return  "Brand: "+ this.getBrand() +
                "Model: "+ this.getModel() +
                "Price: "+ this.getPrice() +
                "Doors: "+ this.getDoors();
    }


    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
}
