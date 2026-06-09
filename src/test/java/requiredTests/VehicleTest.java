package requiredTests;

import com.holang_and_liyanda.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testVehicleConstructor() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 250000, "CA-123-456");
        assertEquals("Toyota", vehicle.getBrand());
    }

    @Test
    void testPriceSetter() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 250000, "CA-123-456");
        vehicle.setPrice(10000.00);
    }
}
