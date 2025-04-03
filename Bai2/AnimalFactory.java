package ss25.Bai2;

public class AnimalFactory {
    public static Animal getAnimal(String animal) {
        if (animal.equalsIgnoreCase("cat")) {
            return new Cat();
        }else if(animal.equalsIgnoreCase("dog")){
            return new Dog();
        }else{
            System.out.println("null");
            return null;
        }
    }
}
