package requiredTests;

import com.holang_and_liyanda.Car;
import com.holang_and_liyanda.CarDealershipApp;
import com.holang_and_liyanda.Vehicle;
import org.junit.jupiter.api.Test;

import com.holang_and_liyanda.*;
import static org.junit.jupiter.api.Assertions.*;

public class RequiredTest {
    @Test
    void testInventoryCount() {
        CarDealershipApp dealership = new CarDealershipApp();

        dealership.addVehicle(
                new Vehicle("Toyota", "Corolla", 250000, "CA-444-555")
        );

        dealership.addVehicle(
                new Vehicle("Ford", "Ranger", 500000, "CA-555-616")
        );
        CarDealershipApp dealership = new CarDealershipApp();
        dealership.addVehicle(new Vehicle("Toyota", "Corolla", 250000, "CA-123-456"));
        dealership.addVehicle(new Vehicle("Ford", "Ranger", 500000, "CA-132-465"));

        assertEquals(2, dealership.getInventoryCount());
    }

    @Test
    void testInventoryValue() {
        CarDealershipApp dealership = new CarDealershipApp();
        dealership.addVehicle(new Vehicle("Toyota", "Corolla", 250000, "CA-465-312"));
        dealership.addVehicle(new Vehicle("Ford", "Ranger", 500000, "CA-987-654"));

        assertEquals(750000, dealership.getTotalInventoryValue());
    }

    @Test
    void testMostExpensiveVehicle() {
        CarDealershipApp dealership = new CarDealershipApp();

        Vehicle v1 =
                new Vehicle("Toyota","Corolla",250000, "CA-313-212");

        Vehicle v2 =
                new Vehicle("Ford","Ranger",500000, "CA-111-222");
        CarDealershipApp dealership = new CarDealershipApp();
        Vehicle v1 = new Vehicle("Toyota","Corolla",250000, "CA-147-258");
        Vehicle v2 = new Vehicle("Ford","Ranger",500000, "CA-741-852");

        dealership.addVehicle(v1);
        dealership.addVehicle(v2);

        assertEquals("Ford", dealership.findMostExpensiveVehicle().getBrand()
        );
    }

    @Test
    void testVehicleInfo() {
        Car car = new Car("Toyota", "Corolla", 250000, 4, "CA-963-369");

        assertEquals("Toyota Corolla - R250000.00 - 4 doors", car.getVehicleInfo()
        );
    }

}
