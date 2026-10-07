package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("Lada", "A123AA", "Белый", 2020,
                "Иван", "111", "Petrol");
        car.setModel("Lada Vesta");
        car.setLicense("A456AA");
        car.setColor("Чёрный");
        car.setYear(2021);
        car.setOwnerName("Пётр");
        car.setInsuranceNumber("222");
        car.setEngineType("Diesel");

        ElectricCar electricCar = new ElectricCar(
                "Tesla Model 3", "E123EE", "Красный", 2023,
                "Анна", "333", 60);
        electricCar.setColor("Синий");
        electricCar.setOwnerName("Мария");
        electricCar.setInsuranceNumber("444");
        electricCar.setBatteryCapacity(75);

        Vehicle electricVehicle = electricCar;
        Car electricAsCar = electricCar;

        System.out.println(car.toString());
        System.out.println();
        System.out.println(electricVehicle.toString());
        System.out.println("\nТип через ссылку Car: "
                + electricAsCar.vehicleType());
    }
}
