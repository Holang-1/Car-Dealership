package requiredTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

public class RequiredTest {
    @Test
    void testInventoryCount() {
        Dealership dealership = new Dealership();

        dealership.addVehicle(
                new Vehicle("Toyota", "Corolla", 250000)
        );

        dealership.addVehicle(
                new Vehicle("Ford", "Ranger", 500000)
        );

        assertEquals(2, dealership.getInventoryCount());
    }

    @Test
    void testInventoryValue() {
        Dealership dealership = new Dealership();

        dealership.addVehicle(
                new Vehicle("Toyota", "Corolla", 250000)
        );

        dealership.addVehicle(
                new Vehicle("Ford", "Ranger", 500000)
        );

        assertEquals(
                750000,
                dealership.getTotalInventoryValue()
        );
    }

    @Test
    void testMostExpensiveVehicle() {
        Dealership dealership = new Dealership();

        Vehicle v1 =
                new Vehicle("Toyota","Corolla",250000);

        Vehicle v2 =
                new Vehicle("Ford","Ranger",500000);

        dealership.addVehicle(v1);
        dealership.addVehicle(v2);

        assertEquals(
                "Ford",
                dealership.findMostExpensiveVehicle().getBrand()
        );
    }

    @Test
    void testVehicleInfo() {
        Car car =
                new Car(
                        "Toyota",
                        "Corolla",
                        250000,
                        4
                );

        assertEquals(
                "Toyota Corolla - R250000.00 - 4 doors",
                car.getVehicleInfo()
        );
    }

}
