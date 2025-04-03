package ss25.Bai2;

abstract class Animal {
    public abstract void speak();
}
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("wofwof");
    }
}
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("mewmew");
    }
}
