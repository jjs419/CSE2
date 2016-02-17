//Jay Scudder
//lab 03 Check
//Feb 12, 2016

//This program is intended to take input data from a user regarding payment at a restaraunt
//The input data includes check amount, tip amount, and ways the bill will be split
//The program will calculate how much each person must pay using the Scanner class

import java.util.Scanner; //importing the Scanner class for use

    //define a class
        public class Check{
            
        //define main method
            public static void main(String[] args) {
                
                Scanner myScanner = new Scanner( System.in ); //Declaring an instance of Scanner
                
                    System.out.print("Enter the original cost of the check (in the format xx.xx): "); //calling for the first input from the user
                    double checkCost = myScanner.nextDouble(); 
                        //this line calls a method that Scanners use to take input data
                        //and tells java that we need this method
                        
                    System.out.print("Enter the tip percentage you wish to pay as a whole number (in the form xx): "); //asking for the tip%
                    double tipPercent = myScanner.nextDouble();
                    tipPercent /= 100; //changing the input tip value into a decimal
                    
                    System.out.print("Enter the number of people that ate dinner: "); //asking for # of ways to split the check
                    int numPeople = myScanner.nextInt();
                    
                    //Now all input is collected
                
                //Begin calculations
                
                double totalCost; //declaring variables
                double costPerPerson;
                int dollars, //whole dollar amount of cost
                    dimes, pennies; //for storing digits
                totalCost = checkCost*(1 + tipPercent); //calculating total cost that is being split
                costPerPerson = totalCost / numPeople;
                dollars = (int)costPerPerson; //changes the value per person into integar dollar amount
                dimes = (int)(costPerPerson * 10) % 10; //calculates 10ths place value of costPerPerson using the % operator
                pennies = (int)(costPerPerson * 100) % 100; //calculates 100ths place value of costPerPerson
                
                //calculations over
                
                System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); //printing cost per person
                
                
            } //end of main method
        } //end of class

