package com.holang_and_liyanda;

public class Car extends Vehicle{
    private int doors;
    public Car(String brand, String model, double price,int doors, String numberPlate){
        super(brand, model, price, numberPlate);
        this.doors = doors;
    }


    @Override
    public String getVehicleInfo(){
        return  getBrand() + " "+
                getModel() +" - "+
                "R"+ String.format("%.2f",getPrice()) +" - "+
                getDoors() +" doors";
    }


    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
}
