package com.holang_and_liyanda;

import java.util.ArrayList;
import java.util.List;

public class CarDealershipApp {
    private List<Vehicle> vehicles;

    public CarDealershipApp() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException();
        }
        this.vehicles.add(vehicle);
    }

    public int getInventoryCount() {
        return vehicles.toArray().length;
    }

    public double getTotalInventoryValue() {
        double total = 0;
        for (Vehicle vehicle1 : vehicles) {
            total += vehicle1.getPrice();
        }
        return total;
    }

    public Vehicle findMostExpensiveVehicle() {
        double highest = 0;
        Vehicle mostExpensive = null;
        for (Vehicle v : vehicles) {
            if (v.getPrice() == highest) {
                return v;
            }
        }
        for (Vehicle v : vehicles) {
            if (v.getPrice() > highest) {
                highest = v.getPrice();
                mostExpensive = new Vehicle(v.getBrand(), v.getModel(), v.getPrice(), v.getNumberPlate());
            }
        }
        return mostExpensive;
    }
    public static void main(String[] args) {


    }
}
