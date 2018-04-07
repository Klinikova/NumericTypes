package numerictypes.java;

import javax.swing.JOptionPane;

public class NumericTypesJava
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2;        // Number of scores
      final double SCORE1 = 100.0; // First test score
      final double SCORE2 = 95.0;   // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5.0 /9.0 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

           // ADD LINES FOR TASK #2 HERE
        
        // declaire variables
        String firstName = "Polina ";
        String lastName = "Klinikova";
        
        // Print out details
        System.out.println( "full Name: " + firstName + "" + lastName );
       
        
    firstName = JOptionPane.showInputDialog("What's your first name?");
    lastName = JOptionPane.showInputDialog("What's your last name?");

    String fullName= firstName + " " + lastName;
    
    System.out.println("What's your full name? " + fullName);
    
    
    // Diameter
    // 1. declare input from user and 2. assigne to variable 'diameter'
        double diameter = Integer.parseInt(JOptionPane.showInputDialog("What is the diameter of a sphere?"));
        System.out.println("Diameter: " + diameter);
        // 3. calculate and store the radius in a variable
        double radius = diameter/2;
        System.out.println("Radius: " + radius);
        // 4. formula of the volume of a sphere
        // Math.pow(chislo, stepen') = Math.pow(4, 3) = chislo 4 v 3 stepeni
        double volume = 4  * Math.PI * Math.pow(radius, 3) / 3;
        // 5. Print result
        System.out.println("Volume: " + volume);
    

        // 1. Print a line indicating this program will calculate mileage per gallon
        System.out.println( "This program will calculate mileage per gallon");
        // 2. Print prompt to user asking for miles driven
        // 3. Read in miles driven 
        double driven = Integer.parseInt(JOptionPane.showInputDialog("Enter miles driven:"));
        // 4. Print prompt to user asking for gallons used
        // 5. Read in gallons used 
        double gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter gallons used:"));
        // 6. Calculate miles per gallon by dividing miles driven by gallons used
        double mpg = driven/gallons;
        // 7. Print miles per gallon along with appropriate labels
        System.out.println("Your miles per gallon is " + mpg);
        
        // 8. Run the program and test it using the following sets of data and record the results:
        // Data Set
        double driven1 = 2000;
        double gallons1 = 100;
        double mpg1 = driven1/gallons1;
        
        double driven2 = 500;
        double gallons2 = 25.5;
        double mpg2 = driven2/gallons2;
        
        double driven3 = 241.5;
        double gallons3 = 10;
        double mpg3 = driven3/gallons3;
        
        double driven4 = 100;
        double gallons4 = 0;
        double mpg4 = driven4/gallons4;
        
        System.out.println("Data set 1: " + mpg1);
        System.out.println("Data set 2: " + mpg2);
        System.out.println("Data set 3: " + mpg3);
        System.out.println("Data set 4: " + mpg4);
        
    }
    
}
