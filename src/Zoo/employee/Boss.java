package Zoo.employee;

public class Boss extends Employee {
    public Boss(String name) {
        super(name, "Boss", 500000);

        addActions(
                this::bossy,
                this::raise
        );
    }

    public void bossy() {
        System.out.println(prefix() + "Get back to work!");
    }

    public void raise() {
        System.out.println(prefix() + "I'm giving you guys a raise!");
    }
}
