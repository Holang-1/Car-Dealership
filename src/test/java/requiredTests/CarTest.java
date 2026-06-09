package requiredTests;

import com.holang_and_liyanda.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCarInheritance() {
        Car car = new Car("Toyota", "Corolla", 250000, "CA-123-456", 4);
        assertInstanceOf(Car.class, car);
    }

    @Test
    void testGetVehicleInfo() {
        Car car = new Car("Toyota", "Corolla", 250000, "CA-123-456", 4);
        assertTrue(car.getVehicleInfo().contains("Toyota"));
        assertTrue(car.getVehicleInfo().contains("Corolla"));
        assertTrue(car.getVehicleInfo().contains("250000"));
        assertTrue(car.getVehicleInfo().contains("CA-123-456"));
        assertTrue(car.getVehicleInfo().contains("4"));
    }
}
