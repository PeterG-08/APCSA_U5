package L1.animal;

public class Giraffe extends Animal {
    public Giraffe(String name, String bday) {
        super("dog", name, true, 10, 10, bday);
    }

    public void giveAcacia() {
        System.out.println(getName() + ": thanks for the yummy acacia! Time to eat!");
        setHungry(false);
    }

    public void brag() {
        System.out.println(getName() + ": look at me I'm so much taller than you guys!");
    }
}
