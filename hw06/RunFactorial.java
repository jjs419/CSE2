//Jay Scudder
//Mar 6, 2016
//homework 6: Factorial
//program intended to take input number and return the factorial calculation

import java.util.Scanner; //importing the Scanner method for use

//define a public class
    public class RunFactorial{
        
        //define a main method
            public static void main(String[] args){
                
                Scanner myScanner = new Scanner( System.in ); //Declaring a new instance of Scanner
                
                int facNum = 0; //initializing variable for use inside loop
                
                while ((facNum < 9) || (facNum > 16)){ //while statement will continue to run until the input is an integer between 9 and 16 inclusively
                    
                    System.out.print("Enter an integer between 9 and 16 inclusively that you wish to calculate the factorial for: "); //prompting the user for the first digit
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                        facNum = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                        if ((facNum < 9) || (facNum > 16)){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter an integer between 9 and 16 inclusively."); //printing an error message if input is <= 0
                        }
                    }
                    else{ //if the input is not an integer or double
                        String trash = myScanner.next(); //this command assigns the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
                    }
                } //end of while loop
                
                int counter = facNum; //initializing counter for use in loop
                int nextNum = 0; //initializing variable for use in calculation
                int prevNum = 1; //initializing variable for use in calculation
                
                while (counter >= 1){ //while loop to continue multiplying until reaches 1
                    nextNum = counter*(prevNum); //calculates the next multiplication
                    counter--; //decrements the counter
                    prevNum = nextNum; //assigns the value calculated in line 39 for use in the next multiplication
                }
                
                System.out.println("Input excepted: "); //telling the user the input was valid
                System.out.println(facNum+"! = "+nextNum); //printing the answer for the user
                
            } //end of main method
    } //end of public class