package L1;

import L1.animal.Animal;
import L1.animal.Cat;
import L1.animal.Dog;
import L1.animal.Giraffe;
import L1.employee.Boss;
import L1.employee.Cook;
import L1.employee.Instructor;

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
