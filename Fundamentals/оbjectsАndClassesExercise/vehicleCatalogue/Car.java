package оbjectsАndClassesExercise.vehicleCatalogue;

public class Car extends Vehicle{

    public Car(String type, String model, String color, int horsepower) {
        super(type, model, color, horsepower);
    }

    @Override
    public String toString() {
        return String.format("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d",
                getModel(),getColor(), getHorsepower());
    }

}
