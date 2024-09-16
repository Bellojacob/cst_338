//Title:        SquareRoot.java
//Abstract:     This program will give an estimate to a square root of a positive whole number using the ancient
//              iterative algorithm. User will provide a positive whole number, and the algorithm will break it down
//              until it is within one percent of the last guess, meaning it is precise within one percent.
//Author:       Jacob Bello
//Date:         9/10/2024

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {

    private int number;
    private boolean validNumber = false;
    private double guess1;
    private double guess2;
    private int count;

    public int getCount() {
        return count;
    }

    public double getGuess1() {
        return guess1;
    }

    public double getGuess2() {
        return guess2;
    }

    public int getNumber() {
        return number;
    }

    private boolean lessThanOne = false;

    public void readValue(){
        // read in a positive whole number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program estimates square roots.");

        // while number the user hasn't entered a positive whole int, keep asking and check it is the right input
        while (!validNumber)  {
            System.out.print("Please enter a positive whole number: ");
            
            try{
                number = scanner.nextInt();

                if (number > 0){
                    validNumber = true;
                } else {
                    System.out.println("Please enter a positive whole number (no words, just numbers): ");
                }

            } catch (InputMismatchException e){
                System.out.println("Please enter a positive whole number (no words, just numbers): ");
                scanner.nextLine();
            }

    }
//        System.out.println("You entered " + number);

    }

    public void sqRtCalc(){
            // initial guess
            guess1 = (double)number/2;
            System.out.printf("%nInitial guess: %.2f %n", guess1);

            // check how many steps it takes to complete
            count = 0;
            // while the program is not within one percent margin, keep breaking down the square root
            while(!lessThanOne){

                guess2 = (guess1 + (double)number / guess1)/2;



                count++;


                if ((guess1 - guess2)/ guess1 < 0.01){
                    lessThanOne = true;
                    System.out.printf("Current estimate is: %.6f %n", guess2);
                    break;
                } else {
                    System.out.printf("Current estimate is: %.6f %n", guess2);
                    guess1 = guess2;
                }

        }




    }

    public void printResult(){
        System.out.printf("%nThe final estimate is %.2f. This took %d iterations.", guess2, count);
    }
}
