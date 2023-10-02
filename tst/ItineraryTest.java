import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItineraryTest {

    private Itinerary itinerary;

    @BeforeEach
    public void setUp() {
        // Create a sample travel package with destinations and activities
        TravelPackage travelPackage = createSampleTravelPackage();
        itinerary = new Itinerary(travelPackage);
    }

    @Test
    public void testGenerateItinerary() {
        // Define the expected itinerary as a string
        String expectedItinerary = "Travel Package Sample Package " +
                "Destination{ name='Destination 1', activities=[Activity{name='Activity 1', description='Description 1', cost=50.0, capacity=30}] } " +
                "Destination{ name='Destination 2', activities=[Activity{name='Activity 2', description='Description 2', cost=75.0, capacity=40}] }";

        // Generate the actual itinerary
        String actualItinerary = itinerary.generateItinerary();

        // Compare the actual and expected itineraries
        assertEquals(expectedItinerary, actualItinerary);
    }

    // Helper method to create a sample travel package
    private TravelPackage createSampleTravelPackage() {
        List<Destination> destinations = new ArrayList<>();
        List<Activity> activities1 = new ArrayList<>();
        List<Activity> activities2 = new ArrayList<>();

        activities1.add(new Activity(1, "Activity 1", null, "Description 1", 50.0, 30));
        activities2.add(new Activity(2, "Activity 2", null, "Description 2", 75.0, 40));

        destinations.add(new Destination("Destination 1", activities1));
        destinations.add(new Destination("Destination 2", activities2));

        return new TravelPackage("Sample Package", destinations);
    }
}
