//Jay Scudder
//March 29, 2016
//hw09
//Program Rectangularize

import java.util.Scanner; //importing the Scanner class for use

//define class
public class Rectangularize{
    
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner( System.in ); //declaring instance of scanner
        int inputInt = 0;        //initializing variable
        String inputString = ""; //
        
        System.out.print("Please enter a string or an integer: "); //prompting user for input
        if(myScanner.hasNextInt()){ //if the input is an integer run this 
            inputInt = myScanner.nextInt(); //setting variable to the input
            rectangle(inputInt); //calling method rectangle with integer input
        }
        else{ //if the input is a string run this
            inputString = myScanner.next(); //setting variable to the input
            rectangle(inputString); //calling method rectangle with string input
        }
        
    } //end of main method
    
    public static void rectangle(int square){ //method rectangle for integers
        
        int i = 0; //initializing variable for use in for loop
        int j = 0; //
        
        for(i=0;i<square;i++){ //for loop that controls what line the program is on
            
            j = 0;
            
            for(j=0;j<square;j++){ //for loop that controls how many times % is printed
                System.out.print("%");
            }
            
            System.out.println("");
            
        }
    } //end of rectangle for integers
    
    public static void rectangle(String square){ //method rectangle for strings
        
        int i = 0; //initializing variable for use in for loop
        
        for(i=0;i<square.length();i++){ //for loop controls printing and on what line
            
            System.out.println(square);
            
        }
    } //end of rectangle for strings
} //end of class