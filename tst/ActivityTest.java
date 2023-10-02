import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ActivityTest {

    @Test
    public void testConstructorAndGetters() {
        Destination destination = new Destination("Test Destination", null);
        Activity activity = new Activity(1, "Test Activity", destination, "Test Description", 100.0, 50);

        assertEquals(1, activity.getId());
        assertEquals("Test Activity", activity.getName());
        assertEquals(destination, activity.getDestination());
        assertEquals("Test Description", activity.getDescription());
        assertEquals(100.0, activity.getCost(), 0.001); // The last argument is the delta for double comparison
        assertEquals(50, activity.getCapacity());
    }

    @Test
    public void testSetters() {
        Activity activity = new Activity(1, "Test Activity", null, null, 100.0, 50);

        activity.setId(2);
        assertEquals(2, activity.getId());

        activity.setName("Updated Activity");
        assertEquals("Updated Activity", activity.getName());

        Destination newDestination = new Destination("New Destination", null);
        activity.setDestination(newDestination);
        assertEquals(newDestination, activity.getDestination());

        activity.setDescription("Updated Description");
        assertEquals("Updated Description", activity.getDescription());

        activity.setCost(200.0);
        assertEquals(200.0, activity.getCost(), 0.001);

        activity.setCapacity(75);
        assertEquals(75, activity.getCapacity());
    }

    @Test
    public void testToString() {
        Activity activity = new Activity(1, "Test Activity", null, "Test Description", 100.0, 50);
        String expectedString = "Activity{name='Test Activity', description='Test Description', cost=100.0, capacity=50}";

        assertEquals(expectedString, activity.toString());
    }
}
