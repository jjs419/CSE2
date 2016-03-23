//Jay Scudder
//Mar 22, 2016
//hw07: Triangles
//program intended to take input and make a triangle of numbers

import java.util.Scanner;

//define a class
public class Triangles{
    
    //define a main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner( System.in ); //Declaring instance of Scanner
        
        int value = 0;
        
        while ((value < 5) || (value > 30)){ //while statement will continue to run until the input is an integer between 5 and 30 inclusively
                    
            System.out.print("Enter an integer between 5 and 30 inclusively for the triangle: "); //prompting the user for the value
            if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                value = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                
                if ((value < 5) || (value > 30)){ //if statement to determine whether or not input is erroneous
                    System.out.println("Error: You must enter an integer between 5 and 30 inclusively."); //printing an error message if input is not within range
                }
                        
            }
            else{ //if the input is not an integer
                String trash = myScanner.next(); //this command assigns the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                System.out.println("Error: You must enter an integer."); //error message for the user
            }
        } //end of while loop
        
        int i = 0;
        int j = 0;
        
        System.out.println("For loop: ");
        for(i=1;i<=value;i++){
            
            for(j=i;j>0;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(i=(value-1);i>=1;i--){
            
            for(j=i;j>0;j--){
                System.out.print(i);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("While loop: ");
        while(i<=value){
            
            j = i;
            while(j>0){
                System.out.print(i);
                j--;
            }
            System.out.println("");
            i++;
        }
        i = (value-1);
        while(i>=1){
            
            j = i;
            while(j>0){
                System.out.print(i);
                j--;
            }
            System.out.println("");
            i--;
        }
        
        System.out.println("");
        System.out.println("Do-while loop: ");
        i = 1;
        j = 1;
        
        do{
            j = i;
            do{
                System.out.print(i);
                j--;
            }
            while(j>0);
            System.out.println("");
            i++;
        }
        while(i<=value);
        
        i = (value-1);
        do{
            j = i;
            do{
                System.out.print(i);
                j--;
            }
            while(j>0);
            System.out.println("");
            i--;
        }
        while(i>=1);
    }
}