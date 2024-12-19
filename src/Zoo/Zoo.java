package Zoo;

import Zoo.animal.Animal;
import Zoo.employee.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zoo {
    private final String name;

    private final Set<Animal> animals = new HashSet<>();
    private final Set<Employee> employees = new HashSet<>();

    public Zoo(String name) {
            this.name = name;
    }

    public void addAnimals(Animal... animals) {
        this.animals.addAll(List.of(animals));
    }

    public void addEmployees(Employee... employees) {
        this.employees.addAll(List.of(employees));
    }

    /**
     * Update the zoo by 1 day, which will iterate through all the animals and employees and call random actions.
     */
    public void update() {
        System.out.println(" ---- Zoo: " + name + " ---- ");
        animals.forEach(Animal::randomAction);
        employees.forEach(Employee::randomAction);

        System.out.println();
    }

    public static void main(String[] args) {

    }
}
