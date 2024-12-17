package L1.animal;

public class Dog extends  Animal {
    public Dog(String name, String bday) {
        super("dog", name, true, 10, 10, bday);

        addActions(
                this::fetch,
                this::pet,
                this::giveTreat
        );
    }

    public void fetch() {
        System.out.println(prefix() + "fetched a ball!");
    }

    public void pet() {
        System.out.println(prefix() + "thanks for petting me!");
    }

    public void giveTreat() {
        System.out.println(prefix() + "thanks so much for the treat!");
        setHungry(false);
    }
}
