import java.util.List;

public class Passenger {
    private int id;
    private String name;
    private String contactNumber;
    private PassengerType membership;

    private double balance;

    private List<Activity> activities;

    public Passenger(int id, String name, String contactNumber, PassengerType membership) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.membership = membership;
        this.balance = 0.0;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public PassengerType getMembership() {
        return membership;
    }

    public void setMembership(PassengerType membership) {
        this.membership = membership;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", membership=" + membership +
                ", activities=" + activities +
                '}';
    }


}
