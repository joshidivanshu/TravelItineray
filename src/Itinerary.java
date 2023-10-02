import java.util.List;
import java.util.StringJoiner;

public class Itinerary {
    private TravelPackage travelPackage;

    public Itinerary(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }

    public String generateItinerary() {
        StringJoiner itinerary = new StringJoiner(" ");
        itinerary.add("Travel Package " + travelPackage.getName());

        List<Destination> destinations = travelPackage.getDestinations();
        destinations.forEach(destination -> {
            itinerary.add(destination.toString());
            List<Activity> activities = destination.getActivities();
            activities.forEach(activity -> itinerary.add(activity.toString()));
        });

        return itinerary.toString();
    }
}
