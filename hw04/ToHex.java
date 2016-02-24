//Jay Scudder
//Homework 4
//Feb 21,2016
//Program intended to convert integer inputs into hexidecimal code

import java.util.*; //importing methods for use, including Scanner

//define class
    public class ToHex{
        
    //define main method
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //declaring an instance of Scanner to receive inputs
            int redValue = 0; //declaring a variable for use later
                System.out.print("Enter integer value for red between 0-255: "); //asking the user for Red color value
                try{ //this statement tests the input from the user, is used with "catch" statements
                    redValue = (int) myScanner.nextDouble(); //calling the Scanner method for a new input number which can be of type double or int
                }
                catch(InputMismatchException e){ //this statements runs in the event that the "try" statement returns an input type mismatch
                    System.out.println("Error: You must input an integer value.");
                }
                int redFirstNum = (int) redValue/16; //finding how many times 16 goes into the input number
                int redSecondNum = redValue%16; //finding the remainder after the aforementioned division
                
                String redFirstChar = ""; //declaring variable for use in the switch statement
                switch (redFirstNum){ //switch statement to determine which hexidecimal character is assigned to each number
                    case 10:
                        redFirstChar = "A";
                        break;
                    case 11:
                        redFirstChar = "B";
                        break;
                    case 12:
                        redFirstChar = "C";
                        break;
                    case 13:
                        redFirstChar = "D";
                        break;
                    case 14:
                        redFirstChar = "E";
                        break;
                    case 15:
                        redFirstChar = "F";
                        break;
                    default:
                        redFirstChar = ""+redFirstNum;
                        break;
                }
                String redSecondChar = "";
                switch (redSecondNum){
                    case 10:
                        redSecondChar = "A";
                        break;
                    case 11:
                        redSecondChar = "B";
                        break;
                    case 12:
                        redSecondChar = "C";
                        break;
                    case 13:
                        redSecondChar = "D";
                        break;
                    case 14:
                        redSecondChar = "E";
                        break;
                    case 15:
                        redSecondChar = "F";
                        break;
                    default:
                        redSecondChar = ""+redSecondNum;
                        break;
                }
                
                System.out.print("Enter integer value for green between 0-255: "); //asking for green color value
                int greenValue = 0;
                try{
                    greenValue = (int) myScanner.nextDouble(); //calling scanner method to recieve an input of type double or integer
                }
                catch(InputMismatchException e){
                    System.out.println("Error: You must input an integer value.");
                }
                int greenFirstNum = (int) greenValue/16; 
                int greenSecondNum = greenValue%16;
                
                String greenFirstChar = ""; //declaring variable for use in the switch statement
                switch (greenFirstNum){ //switch statement to determine which hexidecimal character is assigned to each number
                    case 10:
                        greenFirstChar = "A";
                        break;
                    case 11:
                        greenFirstChar = "B";
                        break;
                    case 12:
                        greenFirstChar = "C";
                        break;
                    case 13:
                        greenFirstChar = "D";
                        break;
                    case 14:
                        greenFirstChar = "E";
                        break;
                    case 15:
                        greenFirstChar = "F";
                        break;
                    default:
                        greenFirstChar = ""+greenFirstNum;
                        break;
                }
                String greenSecondChar = "";
                switch (greenSecondNum){
                    case 10:
                        greenSecondChar = "A";
                        break;
                    case 11:
                        greenSecondChar = "B";
                        break;
                    case 12:
                        greenSecondChar = "C";
                        break;
                    case 13:
                        greenSecondChar = "D";
                        break;
                    case 14:
                        greenSecondChar = "E";
                        break;
                    case 15:
                        greenSecondChar = "F";
                        break;
                    default:
                        greenSecondChar = ""+greenSecondNum;
                        break;
                }
                
                System.out.print("Enter integer value for blue between 0-255: "); //asking for blue color value
                int blueValue = 0;
                try{
                    blueValue = (int) myScanner.nextDouble(); //calling scanner method to recieve an input of type double or integer
                }
                catch(InputMismatchException e){
                    System.out.println("Error: You must input an integer value.");
                }
                int blueFirstNum = (int) blueValue/16; 
                int blueSecondNum = blueValue%16;
                
                String blueFirstChar = ""; //declaring variable for use in the switch statement
                switch (blueFirstNum){ //switch statement to determine which hexidecimal character is assigned to each number
                    case 10:
                        blueFirstChar = "A";
                        break;
                    case 11:
                        blueFirstChar = "B";
                        break;
                    case 12:
                        blueFirstChar = "C";
                        break;
                    case 13:
                        blueFirstChar = "D";
                        break;
                    case 14:
                        blueFirstChar = "E";
                        break;
                    case 15:
                        blueFirstChar = "F";
                        break;
                    default:
                        blueFirstChar = ""+blueFirstNum;
                        break;
                }
                String blueSecondChar = "";
                switch (blueSecondNum){
                    case 10:
                        blueSecondChar = "A";
                        break;
                    case 11:
                        blueSecondChar = "B";
                        break;
                    case 12:
                        blueSecondChar = "C";
                        break;
                    case 13:
                        blueSecondChar = "D";
                        break;
                    case 14:
                        blueSecondChar = "E";
                        break;
                    case 15:
                        blueSecondChar = "F";
                        break;
                    default:
                        blueSecondChar = ""+blueSecondNum;
                        break;
                }
            
            System.out.println("The decimal numbers R: "+redValue+", G: "+greenValue+", B: "+blueValue+", is represented in hexidecimal as: "+redFirstChar+redSecondChar+greenFirstChar+greenSecondChar+blueFirstChar+blueSecondChar);
            
        }//end main method
    }//end of class