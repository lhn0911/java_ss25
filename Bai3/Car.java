package ss25.Bai3;

public class Car {
    private String engine;
    private int seats;
    private String color;

    protected Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car {engine='" + engine + "', seats=" + seats + ", color='" + color + "'}";
    }

}
