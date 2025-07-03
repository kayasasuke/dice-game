import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){

        System.out.print("What is your name?\n> ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");

        int d1 = random.nextInt(6) + 1;
        int d2 = random.nextInt(6) + 1;
        int total = d1 + d2;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        System.out.println("Total value: " + total);

        if(total > 7){
            System.out.println("you" + " won!");
        } else {
            System.out.println("you" + " lost!");
        }

        scanner.close();
    }
}