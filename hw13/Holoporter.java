//Jay Scudder
//hw 12 Holoporter
//Apr 23, 2016

import java.util.Random;
import java.util.Scanner;

//define class
public class Holoporter{
    
    public static void main( String[] args){ //main method
        String[][][] ragged = soRandom(); //initializing
        int i = 0;                        //
        int j = 0;                        //
        int k = 0;                        //
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                for(k=0;k<ragged[i][j].length;k++){
                    ragged[i][j][k] = coder(); //sets each member to a random code
                }
            }
        }
        
        int m = 0;              //initializing
        int n = 0;              //
        int p = 0;              //
        int numEqual = 0;       //
        boolean equal = false;  //
        String searchCode = ""; //
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                for(k=0;k<ragged[i][j].length;k++){
                    searchCode = ragged[i][j][k]; //sets the code to be searched for
                    for(m=0;m<ragged.length;m++){
                        for(n=0;n<ragged[m].length;n++){
                            for(p=0;p<ragged[m][n].length;p++){
                                if(i==m && j==n && k==p){}
                                else{
                                    if(searchCode.equals(ragged[m][n][p])){ //if the search code is equal to any other code after it in the array
                                        numEqual++; //counts how many codes are the same
                                        equal = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if(equal){ //if there were some equal members
            System.out.println("Faulty array: There are " + numEqual + " equal members.");
            return; //end the program
        }
        
        System.out.println("");
        print(ragged); //prints original object 3D array
        String[][][] holder = soRandom(); //new holoport container
        holder = holoport(ragged, holder); //use holoport method to fill the holder appropriately
        System.out.println("");
        print(holder); //print the filled holder
        System.out.println("");
        
        String inputCode = "";    //initializing
        String inputLetters = ""; //
        int inputNumbers = 0;     //
        boolean valid = false;    //
        Scanner myScanner = new Scanner( System.in ); //instance of scanner
        System.out.println("Now search for a code in the holoported version."); //telling the user what is happening next
        
        while(!valid){ //until user input is valid
            System.out.print("Please enter two capital letters: ");
            inputLetters = myScanner.next();
            
            boolean isLetters = wordChecker(inputLetters); //uses the word checker method to determine if the input is made of alphabet characters
            
            if(!isLetters){
                System.out.println("Error: You must enter capital letters.");
            }
            else{
                if(inputLetters.length() > 2 || inputLetters.length() < 2){ //checks the length
                    System.out.println("Error: You must enter TWO capital letters.");
                }
                else{
                    valid = true;
                }
            }
        }
        
        valid = false; //reset
        
        while(!valid){ //until valid input
            System.out.print("Please enter a 4 digit integer: ");
            if(myScanner.hasNextInt()){
                inputNumbers = myScanner.nextInt();
                int digits = (int) Math.log10(inputNumbers) + 1; //this determines how many digits are in the number using log base 10
                if(digits != 4){
                    System.out.println("Error: You must enter FOUR digits.");
                }
                else{
                    valid = true;
                }
            }
            else{
                System.out.println("Error: You must enter integers.");
                String trash = myScanner.next(); //prevents infinite loop
            }
        }
        
        inputCode = (inputLetters + inputNumbers); //the code all together
        sampling(inputCode, holder); //uses sampling method to search for the inputCode in the holoport container
        
        double percentHoloport = percentage(ragged , holder); //making a variable to hold the value from percentage method
        System.out.println("The holoportation percentage is: " + percentHoloport);
        
        frankenstein(holder); //perform frankenstein on the holoport container
        System.out.println("");
        print(holder); //print the frankenstein'd container
    } //end of main method
    
    public static String[][][] soRandom(){ //method soRandom
        
        Random randomGenerator = new Random(); //random instance
        int i = 0; //initializing
        int j = 0; //
        
        String[][][] ragged = new String[randomGenerator.nextInt(9)+1][][]; //new 3D array string random length
        
        for(i=0;i<ragged.length;i++){
            ragged[i] = new String[randomGenerator.nextInt(9)+1][]; //2D random length
        }
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                ragged[i][j] = new String[randomGenerator.nextInt(9)+1]; //1D random length
            }
        }
        
        return ragged;
    } //end of method soRandom
    
    public static String coder(){ //method to make the codes
        
        Random randomGenerator = new Random();
        String code = ""; //initializing
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; //set of letters
        
        String firstLetter = letters[randomGenerator.nextInt(26)];  //one of the letters
        String secondLetter = letters[randomGenerator.nextInt(26)]; //
        
        code = ("" + firstLetter + secondLetter + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9))); //the code is made of the two letters and 4 numbers
        return code;
    } //end of method coder
    
    public static void print( String[][][] ragged){ //method print
        
        for(int i=0;i<ragged.length;i++){
            for(int j=0;j<ragged[i].length;j++){
                System.out.print("[");
                for(int k=0;k<ragged[i][j].length;k++){
                    if(k != ragged[i][j].length - 1){ //if not currently on last member, print comma after the member
                        System.out.print(ragged[i][j][k]+" , ");
                    }
                    else{
                        System.out.print(ragged[i][j][k]);
                    }
                }
                if(ragged[i][j].length == 0){ //for the holoport holder, if there is an extra second dimension array[][], denotes this occurrence
                    System.out.print("Extra second dimension array");
                }
                System.out.print("]");
                if(j != ragged[i].length - 1){ //if not on last member array, separate second dimensions
                    System.out.print(" | ");
                }
            }
            if(ragged[i].length == 0){ //for holoport holder, if there is an extra first dimension array[][][], denotes this occurrence
                System.out.print("{Extra first dimension array}");
            }
            if(i != ragged.length - 1){ //if not on last member of first dimension, separate first dimensions
                System.out.print(" --- ");
            }
        }
        System.out.println("");
    } //end of method print
    
    public static String[][][] holoport(String[][][] object , String[][][] holder){ //method holoport
        int i = 0; //initializing
        int j = 0; //
        int k = 0; //
        
        if(holder.length<=object.length){ //if the holder array[][][] is smaller than the original, continue
            for(i=0;i<holder.length;i++){
                if(holder[i].length<=object[i].length){ //if holder array[][] is smaller than the original, continue
                    for(j=0;j<holder[i].length;j++){
                        if(holder[i][j].length<=object[i][j].length){ //if the holder array[] is smaller than the original, continue
                            for(k=0;k<holder[i][j].length;k++){
                                holder[i][j][k] = object[i][j][k];
                            }
                        }
                        else{
                            for(k=0;k<object[i][j].length;k++){ //fill the holder with the original arrays members until there are none left
                                holder[i][j][k] = object[i][j][k];
                            }
                            for(k=object[i][j].length;k<holder[i][j].length;k++){ //fill leftover arrays members with $$$$$$
                                holder[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(j=0;j<object[i].length;j++){ //fill the holder with the original arrays[][] until there are none left
                        holder[i][j] = object[i][j];
                    }
                    for(j=object[i].length;j<holder[i].length;j++){ //fill leftover arrays[][] with arrays[][] of size 0
                        holder[i][j] = new String[0];
                    }
                }
            }
        }
        else{
            for(i=0;i<object.length;i++){ //fill the holder with the original arrays[][][] until there are none left
                holder[i] = object[i];
            }
            for(i=object.length;i<holder.length;i++){ //fill leftover arrays[][][] with arrays[][][] of size 0
                holder[i] = new String[0][];
            } 
        }
        return holder;
    } //end of holoport method
    
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
    
    public static void sampling(String inputCode , String[][][] holder){
        
        int i = 0;             //
        int j = 0;             //
        int k = 0;             //
        boolean found = false; //
        
        outerloop: //a label for the outerloop to be broken under a certain condition
        for(i=0;i<holder.length;i++){
            for(j=0;j<holder[i].length;j++){
                for(k=0;k<holder[i][j].length;k++){
                    if(inputCode.equals(holder[i][j][k])){ //if the input code is found, break right away
                        found = true;
                        break outerloop;
                    }
                }
            }
        }
        
        if(found){ //if it was found, print the location
            System.out.println("The code was found at the first dimension index: "+i+", second dimension index: "+j+", and member index: "+k+".");
            return;
        }
        else{
            System.out.println("The code was not found.");
            return;
        }
        
    } //end of sampling method
    
    public static double percentage(String[][][] object , String[][][] holder){ //method percentage
        
        double holoportedMolecules = 0.0; //initializing
        double originalMolecules = 0.0;   //
        double percentHoloport = 0.0;     //
        int i = 0;                        //
        int j = 0;                        //
        int k = 0;                        //
        
        for(i=0;i<object.length;i++){
            for(j=0;j<object[i].length;j++){
                for(k=0;k<object[i][j].length;k++){
                    originalMolecules++; //count number of codes in the original
                }
            }
        }
        
        for(i=0;i<holder.length;i++){
            for(j=0;j<holder[i].length;j++){
                for(k=0;k<holder[i][j].length;k++){
                    holoportedMolecules++; //count number of codes in the holoported version
                }
            }
        }
        
        percentHoloport = ((holoportedMolecules-originalMolecules)/originalMolecules)*100; //calculate percent holoportation
        return percentHoloport;
    } //end of method percentage
    
    public static void frankenstein( String [][][] holder){ //method frankenstein
        
        int i = 0;        //initializing
        int j = 0;        //
        int k = 0;        //
        String temp = ""; //
        
        for(i=0;i<holder.length;i++){ //insertion sort
            for(j=0;j<holder[i].length;j++){
                for(k=1;k<holder[i][j].length;k++){
                    int currentMember = k;
                    while(holder[i][j][currentMember].compareTo(holder[i][j][currentMember-1]) < 0){ //.compareTo compares the strings and returns a negative value if the first string comes before the second in the alphabet/number system
                        temp = holder[i][j][currentMember-1];                        //swap
                        holder[i][j][currentMember-1] = holder[i][j][currentMember]; //
                        holder[i][j][currentMember] = temp;                          //
                        currentMember--; //ensures we continue to look at the same code rather than the same space in the array
                        if(currentMember == 0){
                            break;
                        }
                    }
                }
            }
        }
        
        String[] tempArray; //initializing 
        
        for(i=0;i<holder.length;i++){ //insertion sort
            for(j=1;j<holder[i].length;j++){
                int currentArray = j;
                while(holder[i][currentArray].length < holder[i][currentArray-1].length){
                    tempArray = holder[i][currentArray-1];               //swap
                    holder[i][currentArray-1] = holder[i][currentArray]; //
                    holder[i][currentArray] = tempArray;                 //
                    currentArray--; //ensures we continue to look at the same code rather than the same space in the array
                    if(currentArray == 0){
                        break;
                    }
                }
            }
        }
        return;
    }
}