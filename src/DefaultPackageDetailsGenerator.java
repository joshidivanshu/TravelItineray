import java.util.List;

public class DefaultPackageDetailsGenerator implements PackageDetailsGenerator {
    @Override
    public String generatePackageDetails(TravelPackage travelPackage) {
        StringBuilder information = new StringBuilder();
        information.append("Travel Package " + travelPackage.getName() + "\n");
        information.append("Total Capacity " + travelPackage.getCapacity() + "\n");
        information.append("Total Passengers enrolled " + travelPackage.getEnrolled() + "\n");
        information.append("Passenger Details " + "\n");
        List<Passenger> passengers = travelPackage.getPassengers();e
        for (Passenger passenger : passengers) {
            information.append(passenger.getName() + " " + passenger.getContactNumber() + "\n");
        }
        return new String(information);
    }
}
