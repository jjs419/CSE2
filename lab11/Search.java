//Jay Scudder
//lab 11 Array Search
//April 15, 2016

//This program is intended to take input data from a user regarding payment at a restaraunt
//The input data includes check amount, tip amount, and ways the bill will be split
//The program will calculate how much each person must pay using the Scanner class

import java.util.Scanner; //importing the Scanner 
import java.util.Random; //importing random 

//define a class
public class Search{
            
    //define main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in ); //instance of scanner
        Random randomGenerator = new Random(); //random object
        
        int[] array1 = new int[50]; //making arrays of size 50
        int[] array2 = new int[50]; //
        int i = 0; //initalizing variable
        
        for(i=0;i<50;i++){ //for loop assign each member of array1 to random number between 0 and 100
            array1[i] = randomGenerator.nextInt(100);
        }
        
        int min = 100; //initializing variables
        int max = 0;   //
        
        for(i=0;i<50;i++){ //for loop determines max and min
            if(array1[i] < min){
                min = array1[i];
            }
            if(array1[i] > max){
                max = array1[i];
            }
        }
        
        System.out.println("The minimum value of array1 is: " + min + "."); //printing max and min
        System.out.println("The maximum value of array1 is: " + max + "."); //
        
        for(i=0;i<50;i++){ //for loop assign each member of the array to random int between 0 and 100
            array2[i] = randomGenerator.nextInt(100);
        }
        
        int temp = 0;            //initializing variables
        boolean ordered = false; //
        boolean reached = true;  //
        
        while(!ordered){ //continues to run this code until array2 is in order
            for(i=1;i<50;i++){ //for loop 
                if(array2[i]<array2[i-1]){ //if the current value is less than the previous value, switch them
                    temp = array2[i-1];
                    array2[i-1] = array2[i];
                    array2[i] = temp;
                    reached = true; //this says the we reached this piece of code
                }
            }
            if(!reached){ //if we did not reach the previous if statement, that means no switching needed to be done, thus ordered
                ordered = true;
            }
            reached = false; //resets the reached variable to false for the next iteration
        }
        
        min = 100; //initializing 
        max = 0;   //
        
        for(i=0;i<50;i++){ //finds max and min
            if(array2[i] < min){
                min = array2[i];
            }
            if(array2[i] > max){
                max = array2[i];
            }
        }
        
        System.out.println("The minimum value of array2 is: " + min + "."); //prints values
        System.out.println("The maximum value of array2 is: " + max + "."); //
        
        int searchValue = -1; //initializing variable
        
        while(searchValue<0){ //continues to run until input is valid
            System.out.print("Please enter an integer greater than or equal to 0: ");
            if(myScanner.hasNextInt()){
                searchValue = myScanner.nextInt();
                if(searchValue<0){
                    System.out.println("Error: your number must be greater than or equal to 0.");
                }
            }
            else{
                System.out.println("Error: You must enter an integer.");
                String trash = myScanner.next();
            }
        }
        
        int middle = 0;          //initalizing
        int end = 49;            //
        int beginning = 0;       //
        boolean foundIt = false; //
        
        while(!foundIt){ //while the number is not found
            
            middle = (int) ((end-beginning)/2 + beginning); //sets the index to be looked at
            if(array2[middle] == searchValue){ //if the index being looked at is the search number
                System.out.println("The number was found in the list.");
                foundIt = true;
            }
            if(array2[middle] > searchValue){ //if the index being looked at is larger than the search
                end = middle - 1; //changes the array length to the first half
            }
            if(array2[middle] < searchValue){ //if the index being looked at is shorter than the search
                beginning = middle + 1; //changes the array length to the second half
            }
            if(end == beginning){ //if the value was not found
                System.out.println(searchValue + " was not found in the list.");
                if(array2[end] > searchValue){ //if the final index looked at was larger than the search
                    System.out.println("The number above the key was " + array2[end] + ".");
                    System.out.println("the number below the key was " + array2[end-1] + ".");
                }
                if(array2[end] < searchValue){ //if the final index looked at was smaller than the search
                    System.out.println("The number above the key was " + array2[end+1] + ".");
                    System.out.println("the number below the key was " + array2[end] + ".");
                }
                break;
            }
        }
    }
}