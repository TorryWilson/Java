package School;
import java.util.Scanner;
public class Enroll {


    public static void main(String [] arg ) {

        // boolean value for loop later in program
        boolean goodInput = false;
        
        // Creates a student using two parameter constructor of Student class.
        Student classmate = new Student("Torry Wilson", 10);
        classmate.setGPA(3.2);
        classmate.setMajor(Major.HISTORY);
        
        // Creates a student using the constructor with no parameters of Student class.
        Student classmate2 = new Student();
        classmate2.setName("Taylor Joseph");
        classmate2.setID(20);
        classmate2.setGPA(3.4);
        classmate2.setMajor(Major.PHYSICS);
        
        // Creates a student using the constructor with all parameters in Student class.
        Student classmate3 = new Student("Nyya Duhon", 15, 2.4, Major.COMPUTER_SCIENCE);
        
        
        Student classmate4 = new Student();
        
        // create Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        // do-while loop that keeps running until user inputs correct type of information (Alphabets)
        do {
            System.out.println("What's your name?");
            String name = keyboard.nextLine();
            
            // returns true/false in allLetters if the user enters a valid name.
            boolean allLetters = name.chars().allMatch(Character::isLetter);
            try {
                // if statement that allows a name and ID to be set if condition has been met (user entered all alphabets)
                    if (allLetters == true) {
                    classmate4.setName(name);
                    System.out.println("Nice name");
                    classmate4.setID(30);
                    goodInput = true;
                 } // throws an exception I created if the user did not.
                    else throw new Exception();
                } catch (Exception e) { // what wil be printed if user did not enter alphabets.
                System.out.println();
                System.out.println("This is not a valid name");
            }


        }
        // the boolean from the start of the program that allows steps to be repeated if user enters invalid name
            while (!goodInput);
        keyboard.close();
        
        classmate.Display();
        classmate2.Display();
        classmate3.Display();
        classmate4.Display();
    }
}
