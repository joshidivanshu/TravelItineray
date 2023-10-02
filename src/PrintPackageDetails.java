import java.util.List;

public class PrintPackageDetails {
    private PackageDetailsGenerator detailsGenerator;

    public PrintPackageDetails(PackageDetailsGenerator detailsGenerator) {
        this.detailsGenerator = detailsGenerator;
    }

    public String printPackageDetails(TravelPackage travelPackage) {
        return detailsGenerator.generatePackageDetails(travelPackage);
    }

}

