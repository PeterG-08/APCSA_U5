package L1.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animal {
    //what information an animal needs
    private final String species;
    private final String name;

    private final List<Runnable> actions = new ArrayList<>();

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public Animal() {
        this("giraffe", "geoffery");
    }

    public final String prefix() {
        return "[" + species + ": " + name + "] ";
    }

    public final void randomAction() {
        actions.get((int) (actions.size() * Math.random())).run();
    }

    public final void addActions(Runnable... actions) {
        this.actions.addAll(List.of(actions));
    }

    public static void main(String[] args) {
    }
}
