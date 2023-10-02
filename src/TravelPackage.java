import java.util.List;

public class TravelPackage {
    /**
     * this is example java documentation
     * */
    private int id;
    private String name;
    private long capacity;

    private long enrolled;

    private List<Passenger> passengers;

    private List<Destination> destinations;

    public TravelPackage(String name, long capacity) {
        this.name = name;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public long getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(long enrolled) {
        this.enrolled = enrolled;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public String getPackageDetails() {
        return "TravelPackage{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", passengers=" + passengers +
                '}';
    }


}
