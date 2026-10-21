package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.ElectricVehicle;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Lada", "A123AA", "Белый", 2020,
                "Иван", "111");
        ElectricCar electricCar = new ElectricCar(
                "Tesla Model 3", "E123EE", "Красный", 2023,
                "Анна", "333", 60);

        System.out.println("До изменений:");
        System.out.println(car.toString());
        System.out.println();
        System.out.println(electricCar.toString());

        car.setYear(2021);
        car.setOwnerName("Пётр");
        car.setInsuranceNumber("222");
        electricCar.setYear(2024);
        electricCar.setOwnerName("Мария");
        electricCar.setInsuranceNumber("444");

        ElectricVehicle electric = electricCar;
        System.out.println("\nЁмкость до изменения: "
                + electric.getBatteryCapacity() + " кВт·ч");
        electric.setBatteryCapacity(75);
        System.out.println("Ёмкость после изменения: "
                + electric.getBatteryCapacity() + " кВт·ч");

        Vehicle electricVehicle = electricCar;
        System.out.println("\nПосле изменений:");
        System.out.println(car.toString());
        System.out.println();
        System.out.println(electricVehicle.toString());
    }
}
