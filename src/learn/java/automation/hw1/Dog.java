package learn.java.automation.hw1;

public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(String.format("Dog %n says: Woof", getName()));
    };
    public void greets(Dog dog) {
        System.out.println("Wooooooof");
    };
    public void feed() {
        System.out.println(String.format("Feeding dog %n", getName()));
    };
    public void walk() {
        System.out.println(String.format("Walking dog %n", getName()));
    };
    public void play() {
        System.out.println(String.format("Playing with dod %n", getName()));
    };
}
