//Jay Scudder
//lab 10 Arrays
//Feb 12, 2016

//This program is intended to take input data from a user regarding payment at a restaraunt
//The input data includes check amount, tip amount, and ways the bill will be split
//The program will calculate how much each person must pay using the Scanner class

import java.util.Scanner; //importing the Scanner 
import java.util.Random; //importing random 

//define a class
public class Arrays{
            
    //define main method
    public static void main(String[] args) {
                
        Scanner myScanner = new Scanner( System.in ); //Declaring an instance of Scanner
        Random randomGenerator = new Random(); //creating random object
        int numNames = randomGenerator.nextInt(5) + 5;
        String nextName = "";
        
        String[] students = new String[numNames];
        
        System.out.println("This array contains " + numNames + " names.");
        
        int i = 0;
        
        for(i=0;i<numNames;i++){
            System.out.print("Please enter a name: ");
            nextName = myScanner.next();
            students[i] = nextName;
        }
        
        int[] midterm = new int[numNames];
        
        for(i=0;i<numNames;i++){
            midterm[i] = (int) (Math.random()*100);
        }
        
        System.out.println("The midterm grades of the students you entered are: ");
        
        for(i=0;i<numNames;i++){
            System.out.println(students[i] + ": " + midterm[i]);
        }
        
    }
}