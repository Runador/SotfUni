package оbjectsАndClassesExercise.vehicleCatalogue;

public class Truck extends Vehicle{

    public Truck(String type, String model, String color, int horsepower) {
        super(type, model, color, horsepower);
    }

    @Override
    public String toString() {
        return String.format("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d",
                getModel(),getColor(), getHorsepower());
    }

}
