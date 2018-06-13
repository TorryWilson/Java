package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
// object that allows user to input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
// counter for guesses 
        int guesses = 1;
       
// variable that holds the generated random # between 1 - 100
        int randomNumber = new Random().nextInt(100) + 1;
       
        System.out.println("Guessing game!");
        
// asks user to enter number between 1 - 100
        System.out.println("Enter a number between 1 - 100");
        
// stores what user entered in variable number
        int number = keyboard.nextInt();
        
// while loop that continues running until user inputs generated random number
        while (number != randomNumber) {

// if statement that lets user know that the number he/she entered is too high and allows the user to guess again
            if (number > randomNumber) {
                System.out.println("Your number is too high! Try again");
                number = keyboard.nextInt();
                
// increases number of guesses by 1
                guesses++;
            }

// if statement that lets user know that the number he/she entered is too low and allows the user to guess again
            if (number < randomNumber) {
                System.out.println("Your number is too low! Try again"); 
                number = keyboard.nextInt();
                guesses++;
            }

        }

// if user guessed correct number, prints that he/she is correct, how many guesses user had, and what the random number was
        System.out.println("Your correct! On guess " + guesses + ", " + number + " and " + randomNumber + " is a match!" );
    }
}
