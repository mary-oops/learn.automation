package learn.java.automation.hw1;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Woow");
    };
    public void greets(Dog dog) { System.out.println("Woow"); };
    public void greets(BigDog anotherDog) { System.out.println("Woooooooooow"); };
}
