package L1.employee;

public class Instructor extends Employee {
    public Instructor(String name) {
        super(name, "Instructor", 100000);

        addActions(
                this::teach,
                this::nohomework
        );
    }

    public void teach() {
        System.out.println(prefix() + "Okay guys, today we'll be learning about...");
    }

    public void nohomework() {
        System.out.println(prefix() + "Guess what?! No homework today!");
    }
}
