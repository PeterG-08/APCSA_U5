package L1.animal;

public class Dog extends  Animal {
    public Dog(String name, String bday) {
        super("dog", name, true, 10, 10, bday);
    }

    public void fetch() {
        System.out.println(getName() + ": fetched a ball!");
    }

    public void pet() {
        System.out.println(getName() + ": thanks for petting me!");
    }

    public void giveTreat() {
        System.out.println(getName() + ": thanks so much for the treat!");
        setHungry(false);
    }
}
