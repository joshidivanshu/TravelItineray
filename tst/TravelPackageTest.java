=import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TravelPackageTest {

    private TravelPackage travelPackage;

    @BeforeEach
    public void setUp() {
        // Create a sample travel package with destinations and passengers
        travelPackage = createSampleTravelPackage();
    }

    @Test
    public void testGetPackageDetails() {
        // Define the expected package details as a string
        String expectedPackageDetails = "TravelPackage{name='Sample Package', capacity=100, passengers=[Passenger{name='Passenger 1', age=30}, Passenger{name='Passenger 2', age=25}]}";

        // Get the actual package details
        String actualPackageDetails = travelPackage.getPackageDetails();

        // Compare the actual and expected package details
        assertEquals(expectedPackageDetails, actualPackageDetails);
    }

    private

    // Helper method to create a sample travel package
    private TravelPackage createSampleTravelPackage() {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Passenger 1", ));
        passengers.add(new Passenger("Passenger 2", 25));

        TravelPackage travelPackage = new TravelPackage("Sample Package", 100);
        travelPackage.setPassengers(passengers);

        return travelPackage;
    }
}
