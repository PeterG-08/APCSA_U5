package L1.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final String job;
    private final double salary;
    private double currentMoney = 0;

    private final List<Runnable> actions = new ArrayList<>();

    public Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;

        addActions(
                this::workDay
        );
    }

    public final String prefix() {
        return "[" + job + ": " + name + "] ";
    }

    public final void randomAction() {
        actions.get((int) (actions.size() * Math.random())).run();
    }

    public final void addActions(Runnable... actions) {
        this.actions.addAll(List.of(actions));
    }

    public void workDay() {
        currentMoney += salary * (1 / 365.0);
        System.out.println(prefix() + "I just earned some money! My bank account is at $" + currentMoney);
    }


    public static void main(String[] args) {

    }
}
