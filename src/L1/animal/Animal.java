package L1.animal;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    //what information an animal needs
    private String species;
    private String name;
    private boolean hungry;
    private double weight;
    private int age;
    private String birthday;

    private final List<Runnable> actions = new ArrayList<>();
    //question: do you need to fill in all instance variables for a class to work? can you only fill one?

    public Animal(String species, String name, boolean hungry, double weight, int age, String birthday) {
        this.species = species;
        this.name = name;
        this.hungry = hungry;
        this.weight = weight;
        this.age = age;
        this.birthday = birthday;

        addActions(this::makeNoise);
    }

    public Animal() { //class question: how can I bte as lazy as possible right now
        this.species = "giraffe";
        this.name = "geoffrey";
        this.hungry = true; //maybe this leads to future gameification?
        this.weight = 360.77;
        this.age = 12;
        this.birthday = "11/11/11"; //because it is a string, can be formatted in any way

        addActions(this::makeNoise);
    }

    public final String prefix() {
        return "[" + "Animal: " + name + "] ";
    }

    public final void runActions() {
        actions.forEach(Runnable::run);
    }

    public final void addActions(Runnable... actions) {
        this.actions.addAll(List.of(actions));
    }

    //if you wanted to research an animal, what would you want to be able to look up?

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }

    //added after the fact - why isHungry instead of getHungry? (quick note about naming conventions)
    public boolean isHungry() {
        return hungry;
    }

    public void printData() {
        System.out.println("This is a " + species + " named " + name + " who is "+ age + " years old");
    }

    //what are aspects of this animal that should/could be changeable?
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void makeNoise() {
        if (hungry){
            System.out.println(prefix() + "*stomach growls*");
        } else {
            System.out.println(prefix() + "*snores*");
        }
    }


    //discussion question: where are we putting our main method?
    //can put here just for now for testing, or is there time to make a zoo?
    //going forward, you will have classes that control the flow of the entire program. Often
    //these contain the primary main method, but it's a good idea to have a main in all of your
    //classes to more easily/immediately test local behaviors.

    public static void main(String[] args) {
        Animal geoff = new Animal();
        geoff.printData();

        //String species, String name, boolean hungry, double weight, int age, String birthday
        Animal wolf = new Animal("wolf", "big bad", true, 150.1, 7, "the dawn of time");
        wolf.printData();
        System.out.println(wolf.isHungry());

        //what else do we need to test?
        wolf.setHungry(false);
        //how do we know that this worked? --> change printData OR getter for hungry
        //discuss: importance of having a plan - here we don't really know where we're going so
        //we have to make decisions on the fly --> useful to discuss in dev log

        //class consensus: add a getter
        System.out.println(wolf.isHungry());

        //non-getter or setter behavior
        geoff.makeNoise();
        geoff.setHungry(false);
        geoff.makeNoise();

    }
}
