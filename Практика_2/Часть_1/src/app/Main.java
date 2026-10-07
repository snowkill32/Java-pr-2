package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Иван", "111", "Petrol");
        car.setOwnerName("Пётр");
        car.setInsuranceNumber("222");
        car.setEngineType("Diesel");

        System.out.println("Обычный автомобиль");
        System.out.println("Владелец: " + car.getOwnerName());
        System.out.println("Страховка: " + car.getInsuranceNumber());
        System.out.println("Двигатель: " + car.getEngineType());

        ElectricCar electricCar = new ElectricCar("Анна", "333", 60);
        electricCar.setOwnerName("Мария");
        electricCar.setInsuranceNumber("444");
        electricCar.setBatteryCapacity(75);

        System.out.println("\nЭлектромобиль");
        System.out.println("Владелец: " + electricCar.getOwnerName());
        System.out.println("Страховка: " + electricCar.getInsuranceNumber());
        System.out.println("Двигатель: " + electricCar.getEngineType());
        System.out.println("Аккумулятор: "
                + electricCar.getBatteryCapacity() + " кВт·ч");

        // car.ownerName = "Иван"; // private: недоступно из app.
        // car.engineType = "Petrol"; // protected: недоступно из app.
    }
}
