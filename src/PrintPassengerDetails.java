import java.util.List;

public class PrintPassengerDetails {
    private Passenger passenger;

    public PrintPassengerDetails(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean isPremium() {
        if(this.passenger.getMembership().equals(PassengerType.PREMIUM))
            return true;
        return false;
    }

    public String activityDetails(Activity activity) {
        return "Activity{" +
                "name='" + activity.getName() + '\'' +
                ", description='" + activity.getDescription() + '\'' +
                ", cost=" + activity.getCost() + "}";
    }

    public String printDetails() {
        StringBuilder information = new StringBuilder();
        information.append(passenger.getName() + " " + passenger.getContactNumber() + "\n");
        if(!isPremium()) {
            information.append("Balance " + passenger.getBalance());
        }
        List<Activity> activities = passenger.getActivities();
        for(Activity activity : activities) {
            information.append(activityDetails(activity) + "\n");
        }

        return new String(information);

    }


}
