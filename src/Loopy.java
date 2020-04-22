/**
 * Pseudocode
 * Prompt message asking user to enter 5 words
 * Get the value and store it
 *
 * Then declare and initialize redEyes
 * Set redEyes to false
 * **/


import java.sql.SQLOutput;
import java.util.Scanner;

public class Loopy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String word = "";
        System.out.println("Enter 5 words");
        for (int index = 1; index <= 5; index++){
            word += keyboard.nextLine();
        }
        System.out.println("The full phrase is: " + word);

        boolean redEyes = false;
        String again = "y";
        while(!(again.equalsIgnoreCase("n"))) {
            System.out.println("Are your eyes red? indicate y for 'yes' or n for 'no'");
            word = keyboard.nextLine();
            if (word.equalsIgnoreCase("y") || word.equalsIgnoreCase("yes")) {
                redEyes = true;
            } else {
                redEyes = false;
            }
            if (redEyes) {
                System.out.println("Get some sleep");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again?");
            again = keyboard.nextLine();
        }
    }
}
