package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        //"{Model} {Power} {Displacement} {Efficiency}
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] modelsData = scanner.nextLine().split(" ");
            String model = modelsData[0];
            int power = Integer.parseInt(modelsData[1]);
            String displacement = modelsData[2];
            String efficiency = modelsData[3];

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        //"{Model} {Engine} {Weight} {Color}
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] carsData = scanner.nextLine().split(" ");
            String model = carsData[0];
            int weight = Integer.parseInt(carsData[2]);
            String color = carsData[3];

            for (Engine engine : engines) {
                Car car = new Car(model, new Engine(engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency()), weight, color);
                cars.add(car);
            }

        }

    }

}
