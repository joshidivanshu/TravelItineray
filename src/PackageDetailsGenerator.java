/**
Strategy Design
Pattern
 In the refactored code:

 PackageDetailsGenerator is the strategy interface that defines the contract for generating package details.
 DefaultPackageDetailsGenerator is one of the concrete strategies that implements the package details generation algorithm.
 PrintPackageDetails is the context class that uses the selected strategy to perform package details generation.
 The Strategy Pattern allows you to encapsulate different algorithms or behaviors
 (in this case, different ways of generating package details)
 and make them interchangeable without altering the client code.
 This promotes flexibility, maintainability, and adherence to the Open/Closed Principle,
 as you can add new strategies (implementations) without modifying the existing code.
**/
public interface PackageDetailsGenerator {
    public String generatePackageDetails(TravelPackage travelPackage);
}
