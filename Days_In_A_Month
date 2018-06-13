package com.company;
import javax.swing.JOptionPane;
public class Main {

   public static void main(String args[]) {

// variable that stores the user's input from a popup box
      String month = JOptionPane.showInputDialog("Enter MONTH: ");
     
// variable that formats the user's input using all Uppercase to keep consistent
      String format = month.toUpperCase();
      
// if statement that checks to see if the user inputted anything into the popbox if user didnt month would equal ""
      if (!month.equals("")) {

// switch that toggles through each month depending on the month entered by the user and displays the correct # of days
         switch (format) {
            case "JANUARY":
               System.out.println("January has 31 days ");
               break;
               
// February is a special month due to a leap year so if the user inputs February, the program will ask the user if it's a leap year and pending on the answer will give appropriate amount of days.
            case "FEBRUARY":
               String answer = JOptionPane.showInputDialog("Is it a leap year?");
               String upperAnswer = answer.toUpperCase();
               if (upperAnswer.equals("YES")) {
                  System.out.println("February has 28 days ");
               } else {
                  System.out.println("February has 31 days ");
               }
               break;
            case "MARCH":
               System.out.println("March has 31 days ");
               break;
            case "APRIL":
               System.out.println("April has 30 days ");
               break;
            case "MAY":
               System.out.println("May has 31 days ");
               break;
            case "JUNE":
               System.out.println("June has 30 days ");
               break;
            case "JULY":
               System.out.println("July has 31 days ");
               break;
            case "AUGUST":
               System.out.println("August has 31 days ");
               break;
            case "SEPTEMBER":
               System.out.println("September has 30 days ");
               break;
            case "OCTOBER":
               System.out.println("October has 31 days ");
               break;
            case "NOVEMBER":
               System.out.println("November has 30 days ");
               break;
            case "DECEMBER":
               System.out.println("December has 31 days ");
               break;
        // if user enters an invalid month, the program will state that it is not a valid month.
            default:
               System.out.println("Not a month");
         }

      }
// if the user does not enter anything and clicks ok or clicks enter the program will show canceled operation.
      else System.out.println("Canceled operation");
   }

}
