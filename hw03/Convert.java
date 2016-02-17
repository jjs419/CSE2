//Jay Scudder
//Homework 3
//Feb 16, 2016
//Program 1, intended to convert meters to inches

import java.util.Scanner; //importing the Scanner class for use

//define a class
    public class Convert{
        
    //define the main method
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //Declaring an instance of Scanner to receive inputs
            
                System.out.print("Enter the number of meters you wish to convert to inches (in the format xx.xx): "); //prompting the user for input
                double numMeters = myScanner.nextDouble(); //calling the Scanner method for a new input double
                
            double inchesPerMeter = 39.3701; //establishing a constant
            double numInches = inchesPerMeter*numMeters; //calculating the conversion
                
            System.out.println(numMeters + " meters is " + numInches + " inches."); //printing the answer for the user
                
            } //end of main method
    } //end of class