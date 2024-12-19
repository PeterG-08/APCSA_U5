package Zoo;

import Zoo.animal.Cat;
import Zoo.animal.Dog;
import Zoo.animal.Giraffe;
import Zoo.employee.Boss;
import Zoo.employee.Cook;
import Zoo.employee.Instructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var bths = new Zoo("Brooklyn Technical High School");

        var steve = new Dog("Steve");
        var bob = new Giraffe("Bob");
        var jerry = new Cat("Jerry");

        var mrmoffit = new Instructor("Mr.Moffit");
        var andy = new Cook("Andy");
        var mrnewman = new Boss("Mr.Newman");

        bths.addAnimals(steve, bob, jerry);
        bths.addEmployees(mrmoffit, andy, mrnewman);

        while (true) {
            System.out.println("Press enter to update the zoo! (to exit, press \"e\", then enter) ");
            var in = scanner.nextLine();

            if (in.equals("e")) break;

            bths.update();
        }
    }
}
