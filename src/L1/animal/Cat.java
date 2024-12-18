package L1.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super("cat", name);

        addActions(
                this::meow,
                this::laserPointer
        );
    }

    public void meow() {
        System.out.println(prefix() + "meowww.");
    }

    public void laserPointer() {
        System.out.println(prefix() + "ahh! A laser pointer.");
    }
}
