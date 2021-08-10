package learn.java.automation.hw1;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name) {
        super(name);
    }

    public void greets() {
        System.out.println(String.format("Lion %n says: Roar", getName()));
    };
    public void hunting() { System.out.println(String.format("Lion %n goes hunting", getName())); };
}
