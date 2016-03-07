//Jay Scudder
//Mar 6, 2016
//homework 6
//program intended to take input number and create a fibonacci sequence of a desired length

import java.util.Scanner; //Importing the Scanner method for use

//define a public class
    public class Fibonacci{
        
        //define a main method
            public static void main(String[] args){
                
                Scanner myScanner = new Scanner( System.in ); //Declaring a new instance of Scanner
                
                int firstValue = 0; //initializing variable for use inside loop
                
                while (firstValue <= 0){ //while statement will continue to run until the input is a positive integer
                    
                    System.out.print("Enter a positive integer for the first digit in the sequence: "); //prompting the user for the first digit
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                        firstValue = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                        if (firstValue <= 0){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter a POSITIVE integer."); //printing an error message if input is <= 0
                        }
                    }
                    else{ //if the input is not an integer
                        String trash = myScanner.next(); //this command assign the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
                    } 
                } //end of while loop
        
                int secondValue = 0; //initializing variable for use inside loop
                
                while (secondValue <= 0){ //while statement will continue to run until the input is a positive integer
                    
                    System.out.print("Enter a positive integer for the second digit in the sequence: "); //prompting the user for the sceond digit
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                        secondValue = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                        if (secondValue <= 0){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter a POSITIVE integer."); //printing an error message if input is <= 0
                        } 
                    }
                    else{ //if the input is not an integer
                        String trashTwo = myScanner.next(); //this command assign the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
                    } 
                } //end of while loop
        
                int fibLength = 0; //initializing variable for length of fibonacci sequence
                
                while (fibLength < 3){ //continues to run until input is integer >= 3
                    
                    System.out.print("Enter the desired number of values for the fibonacci sequence as an integer greater than or equal to 3: "); //prompting the user for fibonacci length
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                        fibLength = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                        if (fibLength < 3){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter an integer great than or equal to 3."); //printing an error message if input is < 3
                        }
                    }
                    else{ //if the input is not an integer
                        String trashThree = myScanner.next(); //this command assign the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
                    }
                } //end of while loop
                
                int counter = 3; //initializing a counter
                int fibNum = 0; //initializing variable "fibonacci number" for use in while loop
                
                System.out.print("The numbers are: "+firstValue+", "+secondValue+", "); //printing the first two numbers in sequence, because the sequence will always include them
                while (counter <= fibLength){ //while statement continues to perform summation until counter>fibLength
                    
                    fibNum = firstValue+secondValue; //the "fibonacci number" is the next new number in sequence
                    firstValue=secondValue; //along with the next line, moves the summation over to the next two digits
                    secondValue=fibNum;
                    
                    if (counter < fibLength){ //if statement to continue printing the fibonacci numbers and commas when there is more than one number left
                        System.out.print(fibNum+", "); //prints the next number in the sequence and a comma 
                        counter++; //adds 1 to the counter 
                    }
                    else{ //when counter==fiblength, i.e. this is the last number in sequence
                        System.out.print(fibNum+"."); //prints final number and a period to end the statement
                        counter++; //adds 1 to the counter to prevent infinite satisfaction of else statement and loop
                    }
                } //end of while loop
                System.out.println(""); //goes to the next line
            
            } //end of main method
    } //end of public class

