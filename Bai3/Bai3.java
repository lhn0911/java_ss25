package ss25.Bai3;

public class Bai3 {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setEngine("V8")
                .setSeats(4)
                .setColor("Red")
                .build();

        Car car2 = new CarBuilder()
                .setEngine("Electric")
                .setSeats(2)
                .setColor("Blue")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
