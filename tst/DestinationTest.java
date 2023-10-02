import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class DestinationTest {

    @Test
    public void testConstructorAndGetters() {
        List<Activity> activities = new ArrayList<>();
        Activity activity1 = new Activity(1, "Activity 1", null, "Description 1", 50.0, 30);
        Activity activity2 = new Activity(2, "Activity 2", null, "Description 2", 75.0, 40);

        activities.add(activity1);
        activities.add(activity2);

        Destination destination = new Destination("Test Destination", activities);

        assertEquals("Test Destination", destination.getName());
        assertEquals(activities, destination.getActivities());
    }

    @Test
    public void testSetters() {
        List<Activity> activities = new ArrayList<>();
        Destination destination = new Destination("Test Destination", activities);

        assertEquals("Test Destination", destination.getName());
        assertEquals(activities, destination.getActivities());

        List<Activity> newActivities = new ArrayList<>();
        Activity newActivity = new Activity(1, "New Activity", null, "New Description", 100.0, 20);
        newActivities.add(newActivity);

        destination.setName("Updated Destination");
        destination.setActivities(newActivities);

        assertEquals("Updated Destination", destination.getName());
        assertEquals(newActivities, destination.getActivities());
    }

    @Test
    public void testToString() {
        List<Activity> activities = new ArrayList<>();
        Destination destination = new Destination("Test Destination", activities);

        String expectedString = "Destination{name='Test Destination', activities=[]}";

        assertEquals(expectedString, destination.toString());
    }

}