package L1.employee;

public class Employee {
    //TODO: create employee class variables
    private String name;
    private String job;
    private double salary;
    private int age;
    private double currentMoney = 0;


    //TODO: create constructors
    public Employee(String name, String job, double salary, int age) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        this("Jeff", "Plumber", 10003.13, 13);
    }


    //TODO: create getters and setters
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

    //TODO: any other methods?
    public void pay(double money) {
        currentMoney += money;
    }


    //TODO: create main method test
    public static void main(String[] args) {
        var bob = new Employee("bob", "astronaut", 1500000000, 99);
    }
}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo
