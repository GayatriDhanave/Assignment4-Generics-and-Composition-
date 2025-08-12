package Composition;

public class Engine {
    int horsePower;
    String fuelType;

    public Engine (int horsePower, String fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
    @Override
    public String toString () {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
