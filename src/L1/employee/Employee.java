package L1.employee;

public class Employee {
    //TODO: create employee class variables
    private String name;
    private String job;
    private double salary;
    private int age;
    private double currentMoney = 0;

    public Employee(String name, String job, double salary, int age) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this("Jeff", "Plumber", 10003.13, 13);
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

    public void pay(double money) {
        currentMoney += money;
    }


    public static void main(String[] args) {
        var bob = new Employee("bob", "astronaut", 1500000000, 99);

        assert bob.getName().equals("bob");
        assert bob.getJob().equals("astronaut");
        assert bob.getSalary() == 1500000000;
        assert bob.getAge() == 99;

        bob.pay(100);

        assert bob.getSalary() == 1500000100;
    }
}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo
