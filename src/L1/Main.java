package L1;

import L1.animal.Animal;
import L1.animal.Cat;
import L1.animal.Dog;
import L1.animal.Giraffe;
import L1.employee.Boss;
import L1.employee.Cook;
import L1.employee.Instructor;

public class Main {
    public static void main(String[] args) {
        Zoo bths = new Zoo("Brooklyn Technical High School");

        var steve = new Dog("Steve", "December 16th");
        var bob = new Giraffe("Bob", "January 1st");
        var jerry = new Cat("Jerry", "August 13th");

        var mrmoffit = new Instructor("Mr.Moffit", 22);
        var andy = new Cook("Andy", 99);
        var mrnewman = new Boss("Mr.Newman", 3);

        bths.addAnimals(steve, bob, jerry);


        bths.update();
    }
}
