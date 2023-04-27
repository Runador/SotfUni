package оbjectsАndClassesExercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vehicleData = scanner.nextLine();
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks= new ArrayList<>();
        double averageHorsePowerCars = 0;
        double averageHorsePowerTrucks = 0;
        int sumCars = 0;
        int sumTrucks = 0;

        while (!vehicleData.equals("End")) {

            String typeOfVehicle = vehicleData.split(" ")[0];
            String model = vehicleData.split(" ")[1];
            String color = vehicleData.split(" ")[2];
            int horsepower = Integer.parseInt(vehicleData.split(" ")[3]);

            switch (typeOfVehicle) {
                case "car":
                    Car car = new Car(typeOfVehicle, model, color, horsepower);
                    cars.add(car);
                    sumCars += horsepower;
                    break;
                case "truck":
                    Truck truck = new Truck(typeOfVehicle, model, color, horsepower);
                    trucks.add(truck);
                    sumTrucks += horsepower;
                    break;
            }

            vehicleData = scanner.nextLine();
        }

        String model = scanner.nextLine();

        while (!model.equals("Close the Catalogue")) {

            for (Car car : cars) {
                if (model.equals(car.getModel())) {
                    System.out.println(car);
                }
            }
            for (Truck truck : trucks) {
                if (model.equals(truck.getModel()))
                System.out.println(truck);
            }

            model = scanner.nextLine();
        }

        int carsSize = cars.size();
        int truckSize = trucks.size();

        averageHorsePowerCars = sumCars * 1.0 / carsSize;
        averageHorsePowerTrucks = sumTrucks * 1.0 / truckSize;

        if (cars.size() == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);
        }

        if (trucks.size() == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);
        }

    }

}

