package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year,
               String ownerName, String insuranceNumber,
               String engineType) {
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
        setOwnerName(ownerName);
        setInsuranceNumber(insuranceNumber);
        setEngineType(engineType);
    }

    public String vehicleType() {
        return "Car";
    }
}
