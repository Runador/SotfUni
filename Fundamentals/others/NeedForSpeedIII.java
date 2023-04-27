package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String carData = scanner.nextLine();
            String model = carData.split("\\|")[0];
            int mileage = Integer.parseInt(carData.split("\\|")[1]);
            int fuel = Integer.parseInt(carData.split("\\|")[2]);

            Car car = new Car(model, mileage, fuel);
            cars.add(car);
        }

        String commands = scanner.nextLine();

        while (!commands.equals("Stop")) {
            // Drive : {car} : {distance} : {fuel}
            String command = commands.split(" : ")[0];

            switch (command) {
                case "Drive":
                    String model = commands.split(" : ")[1];
                    int distance = Integer.parseInt(commands.split(" : ")[2]);
                    int fuel = Integer.parseInt(commands.split(" : ")[3]);

                    if (distance > 0 && fuel > 0) {
                        for (Car car : cars) {
                            if (car.getModel().equals(model)) {
                                if (fuel > car.getFuel()) {
                                    System.out.println("Not enough fuel to make that ride");
                                    break;
                                } else {
                                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", model, distance, fuel);
                                    car.setMileage(car.getMileage() + distance);
                                    car.setFuel(car.getFuel() - fuel);
                                    if (car.getMileage() > 100000) {
                                        System.out.printf("Time to sell the %s!%n", car.getModel());
                                        cars.remove(car);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case "Refuel":
                    String modelCar = commands.split(" : ")[1];
                    int fuelAmount = Integer.parseInt(commands.split(" : ")[2]);
                    for (Car car : cars) {
                        if (modelCar.equals(car.getModel())) {
                            int reminder = 75 - car.getFuel();
                            if ((car.getFuel() + fuelAmount) <= 75) {
                                car.setFuel(car.getFuel() + fuelAmount);
                                if ((fuelAmount + car.getFuel()) != 75) {
                                    System.out.printf("%s refueled with %d liters%n", car.getModel(), fuelAmount);
                                }
                            } else {
                                car.setFuel(75);
                                System.out.printf("%s refueled with %d liters%n", car.getModel(), reminder);
                            }
                        }
                    }
                    break;
                case "Revert":
                    String carModel = commands.split(" : ")[1];
                    int kilometers = Integer.parseInt(commands.split(" : ")[2]);

                    for (Car car : cars) {
                        if (car.getModel().equals(carModel)) {
                            car.setMileage(car.getMileage() - kilometers);
                            if (car.getMileage() < 10000) {
                                car.setMileage(10000);
                                break;
                            } else {
                                System.out.printf("%s mileage decreased by %d kilometers%n", carModel, kilometers);
                            }
                        }
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        for (Car car : cars) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car.getModel(), car.getMileage(), car.getFuel());
        }

    }

}

class Car {

    private String model;
    private int mileage;
    private int fuel;

    public Car(String model, int mileage, int fuel) {
        this.model = model;
        this.mileage = mileage;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return String.format("%s|%d|%d", getModel(), getMileage(), getFuel());
    }

}
