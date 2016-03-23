//Jay Scudder
//Mar 22, 2016
//hw07: Twisty
//program intended to take input and make a twist comprised of slashes and number symbols

import java.util.Scanner;

//define a class
public class Twisty{
    
    //define a main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner( System.in ); //Declaring instance of Scanner
        
        int length = 0;
        int width = 0;
        
        while ((length < 1) || (length > 80)){ //while statement will continue to run until the input is an integer between 1 and 80 inclusively
                    
            System.out.print("Enter an integer between 1 and 80 inclusively for the length of the twist: "); //prompting the user for the length
            if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                length = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                if ((length < 3) || (length > 80)){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter an integer between 1 and 80 inclusively."); //printing an error message if input is not within range
                }
                        
            }
            else{ //if the input is not an integer
                        String trash = myScanner.next(); //this command assigns the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
            }
        } //end of while loop
        
        while ((width < 3) || (width > length)){ //input must be atleast 3 and less than the length
                    
            System.out.print("Enter an integer between greater than 2 and less than the length for the width of the twist: "); //prompting the user for the width
            if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                width = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                if ((width < 3) || (width >= length)){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter an integer between 2 and length exclusively."); //printing an error message if input is not within range
                }
                        
            }
            else{ //if the input is not an integer
                        String trash = myScanner.next(); //this command assigns the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
            }
        } //end of while loop
        
        int i = 0;
        int j = 0;
        int x = 0;
        int y = 0;
        
        for(i=0;i<width;i++){
            
            for(j=0;j<length;j++){
                
                x = j/width;
                y = j%width;
                
                if(y==i){
                    if(x%2==0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("\\");
                    }
                }
                else if(y == (width-1-i)){
                    if(x%2==0){
                        System.out.print("/");
                    }
                    else{
                        System.out.print("#");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(""); 
        }
        
        
        
        
        
        
    }
}