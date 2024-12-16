package L1.animal;

public class Cat extends Animal {
    public Cat(String name, String bday) {
        super("dog", name, true, 10, 10, bday);
    }

    public void meow() {
        System.out.println(getName() + ": meowww.");
    }

    public void laserPointer() {
        System.out.println(getName() + ": ahh! A laser pointer.");
    }
}
