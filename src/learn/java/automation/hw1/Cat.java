package learn.java.automation.hw1;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(String.format("Cat %n says: Meow", getName()));
    };
    public void feed() {
        System.out.println(String.format("Feeding cat %n", getName()));
    };
    public void walk() {
        System.out.println(String.format("Walking cat %n", getName()));
    };
    public void play() {
        System.out.println(String.format("Playing with cat %n", getName()));
    };
}
