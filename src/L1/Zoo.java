package L1;

import L1.animal.Animal;
import L1.employee.Employee;

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

    public String getName() {
        return name;
    }

    public void addAnimals(Animal... animals) {
        this.animals.addAll(List.of(animals));
    }

    public Animal getAnimal(String name, String species) {
        var animal = animals.stream().filter((a) -> a.getName().equals(name) && a.getSpecies().equals(species)).findFirst();

        if (animal.isPresent()) {
            return animal.get();
        }

        throw new Error("Can't find animal: " + name + " of species " + species);
    }

    public void addEmployees(Employee... employees) {
        this.employees.addAll(List.of(employees));
    }

    public Employee getEmployee(String name) {
        var employee = employees.stream().filter((a) -> a.getName().equals(name)).findFirst();

        if (employee.isPresent()) {
            return employee.get();
        }

        throw new Error("Can't find employee: " + name);
    }

    public static void main(String[] args) {
        var zoo = new Zoo("Bronx Zoo");

        assert zoo.getName().equals("Bronx Zoo");

        var a = new Animal("dog", "a", true, 100, 1, "today");
        var e = new Employee("bob", "janitor", 10, 30);

        zoo.addAnimals(a);
        zoo.addEmployees(e);

        assert zoo.getAnimal("a", "dog") != null;
        assert zoo.getEmployee("bob") != null;
    }
}
