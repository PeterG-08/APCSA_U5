package Zoo.employee;

public class Cook extends Employee {
    public Cook(String name) {
        super(name, "Cook", 50000);

        addActions(
                this::question,
                this::food
        );
    }

    public void question() {
        System.out.println(prefix() + "What do you guys want for lunch??");
    }

    public void food() {
        System.out.println(prefix() + "I made your favorite!");
    }
}
