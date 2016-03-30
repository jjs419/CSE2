//Jay Scudder
//March 29, 2016
//hw09
//Program Games

import java.util.Scanner; //importing the Scanner class for use
import java.util.Random; //importing the random method to make random numbers

//define a class
public class Games{
    
    //main method
    public static void main(String[] args){
        
        int gameChoice = 0; //initializing variable
        
        Scanner myScanner = new Scanner( System.in ); //declaring instance of scanner
        
        System.out.println("Welcome to Jay's Game Center!"); //Welcoming/prompting user
        System.out.println("Please choose a minigame:");     //
        System.out.println("For Guess The Box, type 1");     //
        System.out.println("For Spin The Wheel, type 2");    //
        System.out.println("For Scrambler, type 3");         //
        
        while ((gameChoice < 1) || (gameChoice > 3)){ //this loop catches invalid inputs
            
            System.out.print("Game: "); //prompt
            if(myScanner.hasNextInt()){
            
                gameChoice = myScanner.nextInt();
                if((gameChoice < 1) || (gameChoice > 3)){
                    System.out.println("Error: You must enter one of the three integer options.");
                }
            }
            else{
                System.out.println("Error: You must enter one of the three integer options.");
                String trash = myScanner.next(); //prevents infinite loop
            }
        }
        if(gameChoice == 1){       //calls method based on user choice
            guessTheBox();
        }
        else if(gameChoice == 2){  //
            spinTheWheel();
        }
        else if(gameChoice == 3){  //
            scrambler();
        }
    } //end of main method
    
    public static void guessTheBox(){ //method guess the box
        
        Scanner myScanner = new Scanner( System.in ); //declaring instance of scanner
        Random randomGenerator = new Random(); //creating the random object
        int boxChoice = 0; //initializing variables
        int prizeBox = 0;  //winning box
        
        prizeBox = (randomGenerator.nextInt(2) + 1);
        
        System.out.println("Welcome to Guess The Box!");
        
        while ((boxChoice < 1) || (boxChoice > 3)){ //catching erroneous inputs
            
            System.out.print("Guess which box (1, 2, or 3) holds your prize: ");
            if(myScanner.hasNextInt()){
            
                boxChoice = myScanner.nextInt();
                if((boxChoice < 1) || (boxChoice > 3)){
                    System.out.println("Error: You must enter one of the three integer options.");
                }
            }
            else{
                System.out.println("Error: You must enter one of the three integer options.");
                String trash = myScanner.next(); //prevents infinite loop
            }
        }
        if( boxChoice == prizeBox){ //determining whether or not the user won
            System.out.println("Congratulations! You've won the prize of a giant teddy bear!");
        }
        else{
            System.out.println("Aw, that box was empty!");
        }
    } //end of guessTheBox
    
    public static void spinTheWheel(){ //method spin the wheel
        
        Scanner myScanner = new Scanner( System.in ); //declaring instance of scanner
        Random randomGenerator = new Random(); //creating the random object
        int numChoice = 0;                                //initializing variables
        String colorChoice = "";                          //
        String winColorCapital = "";                      //accepting both upper case and lower case inputs
        String winColorLower = "";                        //
        int winNumber = (randomGenerator.nextInt(4) + 1); //picks random winning number
        int randomColor = randomGenerator.nextInt(2);     //picks winning color
        
        switch(randomColor){ //switch determines what color was landed on
            case 0:
                winColorCapital = "Black";
                winColorLower = "black";
                break;
            case 1:
                winColorCapital = "Red";
                winColorLower = "red";
                break;
        }
        
        System.out.println("Welcome to Spin The Wheel!");
        
        while ((numChoice < 1) || (numChoice > 5)){ //catches erroneous inputs
            
            System.out.print("Pick a number 1 through 5: ");
            if(myScanner.hasNextInt()){
            
                numChoice = myScanner.nextInt();
                if((numChoice < 1) || (numChoice > 5)){
                    System.out.println("Error: You must enter an integer between 1 and 5.");
                }
            }
            else{
                System.out.println("Error: You must enter an integer between 1 and 5.");
                String trash = myScanner.next(); //prevents infinite loop
            }
        }
        
        boolean correct = false; //initializing boolean for use in while loop
        
        while (!correct){ //catches erroneous inputs
            
            System.out.print("Pick a color, Red or Black: ");
            colorChoice = myScanner.next();
            
            if((colorChoice.equals("black")) || (colorChoice.equals("Black")) || (colorChoice.equals("Red")) || (colorChoice.equals("red"))){
                correct = true;
            }
            else{
                colorChoice = ""; //technically not necessary but maintains starting conditions
                System.out.println("Error: You must enter Red or Black");
            }
                
        }
        
        System.out.println("The wheel landed on " + winColorCapital + " " + winNumber+"."); //printing the verdict
        
        if(((colorChoice.equals(winColorCapital)) || (colorChoice.equals(winColorLower))) && (numChoice == winNumber)){ //determining if user won
            System.out.println("Congratulations! The wheel landed on your choice!");
        }
        else{
            System.out.println("The wheel did not land on your choice. Better luck next time!");
        }
    } //end of spin the wheel
    
    public static void scrambler(){ //method scrambler
        
        Scanner myScanner = new Scanner( System.in ); //declaring instance of scanner
        String userWord = "";      //initializing variables
        String scrambledWord = ""; //
        boolean correct = false;   //
        
        System.out.println("Welcome to Scrambler!");
        
        while(!correct){
            
            System.out.print("Please enter the word you wish to scramble: ");
            userWord = myScanner.next();
        
            boolean isAWord = wordChecker(userWord); //this checks if the input is some combination of letters (no symbols)
        
            if(isAWord){ //prevents erroneous inputs that include chars that are not letters
                scrambledWord = wordScrambler(userWord);
                System.out.println(scrambledWord);
                correct = true;
            }
            else{
                System.out.println("Error: You must enter a word.");
            }
        }
    } //end of method scrambler
    
    public static boolean wordChecker(String input){ //method word checker to make sure inputs are strings made of letters
        
        char c = ' ';         //initializing variables
        boolean word = false; //
        int nonLetters = 0;   //number of chars that are not letters
        int i = 0;            //
        
        for(i=0;i<input.length();i++){ //for loop that checks if each character is a letter
            
            c = input.charAt(i); //sets c equal to the character at the index location 'i' in the input string
            
            if(!Character.isLetter(c)){ //checks if c is not a letter
                nonLetters++;
            }
        }
        
        if((nonLetters == 0) && (input.length()>0)){ //if there were no nonLetters and the input had atleast one char
            word = true;
        }
        return word;
    } //end of method word checker
    
    public static String wordScrambler(String input){ //method word scrambler to actually scramble the word
        
        Random randomGenerator = new Random(); //creating the random object
        int pieceOrder = randomGenerator.nextInt(2); //initializing variable which randomly orders pieces of the string
        
        if(input.length() == 1){ //if the input string is only one char, just print that char
            return input;
        }
        
        int cut = input.length()/2; //cuts the input in half for use in following statements
        
        String piece1 = wordScrambler(input.substring(0,cut)); //splits the input into two halves. The recurrence here splits the input
        String piece2 = wordScrambler(input.substring(cut));   //until each "piece" is only one char
        
        if(pieceOrder == 0){ //randomly orders the chars based on random number generator
            return (piece1 + piece2);
        }
        else{
            return (piece2 + piece1);
        }
    } //end of method word scrambler
} //end of public class