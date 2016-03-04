//Jay Scudder
//March 4, 2016
//lab 06 Twist Generator
//This program is intended to make twist with a length specified by the user

import java.util.Scanner; //importing Scanner class for use

//define class
    public class TwistGenerator{
        
    //define main method
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //Declaring instance of Scanner
            
                int length = 0;
                
                while (length <= 0){ //while loop to continually ask for an input if the input given was not a positive integer
                
                    System.out.print("Enter the desired length of the twist as a positive integer: "); //asking the user for the input length
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                        
                        length = myScanner.nextInt(); //calling the Scanner method to receive a new input integer and assign it to length
                        
                    } //end of if statement
                    else{ //if the user does not input and integer, executes this else statement
                        
                        System.out.println("Error: You must enter an integer"); //Tells the user the mistake
                        String trash = myScanner.next(); //assigns their erroneous input to a variable to prevent infinite loop
                
                    } //end of else statement
            
                } //end of while loop
                
                int partialTwists = length%3; //determining how many partial twists there are in the full length
                int fullTwists = (int) (length/3); //determining how many full twist there are in the length
                int counter = 0; //initializing a counter
                
                while (counter < fullTwists){ //this while statement will print until the number of full twists is reached
                    counter++;//adding one to the counter each time the while is executed
                    System.out.print("\\ /");
                }
                
                switch (partialTwists){ //this switch statement will print parts of a twist depending on remainder
                    case 1:
                        System.out.print("\\");
                        break;
                    case 2:
                        System.out.print("\\ ");
                        break;
                }
                    
                System.out.println(""); //this statement is meant to make the program start printing on the next line under
                counter = 0; //restarting the counter for use in the next while statement
                
                while (counter < fullTwists){ //will print until # of full twists is reached
                    counter++;
                    System.out.print(" X ");
                }
                
                switch (partialTwists){ //prints partial twists
                    case 1:
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print(" X");
                        break;
                }
                
                System.out.println(""); //next line
                counter = 0; //restarting counter
                
                while (counter < fullTwists){ //will print until # of full twists reached
                    counter++;
                    System.out.print("/ \\");
                }
                
                switch (partialTwists){
                    case 1:
                        System.out.print("/");
                        break;
                    case 2:
                        System.out.print("/ ");
                        break;
                }
                
                System.out.println("");

        } //end of main method
    } //end of public class