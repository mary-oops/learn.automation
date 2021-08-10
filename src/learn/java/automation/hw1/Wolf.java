package learn.java.automation.hw1;

public class Wolf extends Animal implements WildAnimal {
    public Wolf(String name) {
        super(name);
    }
    public void greets() {
        System.out.println(String.format("Wolf %n says: Hawoo", getName()));
    };
    public void hunting() { System.out.println(String.format("Wolf %n goes hunting", getName())); };
}
