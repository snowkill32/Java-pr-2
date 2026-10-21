package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber) {
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
        setOwnerName(ownerName);
        setInsuranceNumber(insuranceNumber);
        setEngineType("Combustion");
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
