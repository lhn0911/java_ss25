package ss25.Bai2;

public class Bai2 {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal("cat");
        Animal dog = AnimalFactory.getAnimal("dog");
        cat.speak();
        dog.speak();

    }
}
