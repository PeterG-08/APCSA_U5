package L1.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    //TODO: create employee class variables
    private String name;
    private String job;
    private double salary;
    private int age;
    private double currentMoney = 0;

    private final List<Runnable> actions = new ArrayList<>();

    public Employee(String name, String job, double salary, int age) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.age = age;

        addActions(
                this::workDay
        );
    }

    public Employee() {
        this("Jeff", "Plumber", 10003.13, 13);
    }

    public final String prefix() {
        return "[" + "Employee: " + name + "] ";
    }

    public final void runActions() {
        actions.forEach(Runnable::run);
    }

    public final void addActions(Runnable... actions) {
        this.actions.addAll(List.of(actions));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public void workDay() {
        currentMoney += salary * (1 / 365.0);
    }


    public static void main(String[] args) {
        var bob = new Employee("bob", "astronaut", 1500000000, 99);

        assert bob.getName().equals("bob");
        assert bob.getJob().equals("astronaut");
        assert bob.getSalary() == 1500000000;
        assert bob.getAge() == 99;

//        bob.workDay();
//
//        assert bob.getCurrentMoney() == bob.getSalary() * 10;
    }
}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo
