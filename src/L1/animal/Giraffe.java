package L1.animal;

public class Giraffe extends Animal {
    public Giraffe(String name) {
        super("giraffe", name);

        addActions(
                this::giveAcacia,
                this::brag
        );
    }

    public void giveAcacia() {
        System.out.println(prefix() + "thanks for the yummy acacia! Time to eat!");
    }

    public void brag() {
        System.out.println(prefix() + "look at me I'm so much taller than you guys!");
    }
}
