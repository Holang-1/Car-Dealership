package com.holang_and_liyanda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarDealershipApp {
    private List<Vehicle> vehicles;
    public CarDealershipApp(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
    public void removeVehicle(String numberPlate){
        for (Vehicle vehicle : vehicles){
            if (Objects.equals(vehicle.getNumberPlate(), numberPlate)){
                vehicles.remove(vehicle);
            }
        }
    }
    public int getInventoryCount(){
        return vehicles.size();
    }
    public double getTotalInventoryValue(){
        double totalValue = 0;
        for (Vehicle vehicle : vehicles){
            totalValue += vehicle.getPrice();
        }
        return totalValue;
    }
    public Vehicle findMostExpensiveVehicle(){
        double highestValue = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle.getPrice() > highestValue){
                highestValue = vehicle.getPrice();
            }
        }
        for (Vehicle vehicle : vehicles){
            if (vehicle.getPrice() == highestValue){
                return vehicle;
            }
        }
        return null;
    }


    public static void main() {

    }
}
