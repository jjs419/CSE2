//Jay Scudder
//hw 12 Holoporter
//Apr 23, 2016

import java.util.Random;
import java.util.Scanner;

//define class
public class Holoporter{
    
    public static void main( String[] args){
        String[][][] ragged = soRandom();
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                for(k=0;k<ragged[i][j].length;k++){
                    ragged[i][j][k] = coder();
                }
            }
        }
        
        int m = 0;
        int n = 0;
        int p = 0;
        int numEqual = 0;
        boolean equal = false;
        String searchCode = "";
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                for(k=0;k<ragged[i][j].length;k++){
                    searchCode = ragged[i][j][k];
                    for(m=0;m<ragged.length;m++){
                        for(n=0;n<ragged[m].length;n++){
                            for(p=0;p<ragged[m][n].length;p++){
                                if(i==m && j==n && k==p){}
                                else{
                                    if(searchCode.equals(ragged[m][n][p])){
                                        numEqual++;
                                        equal = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if(equal){
            System.out.println("Faulty array: There are " + numEqual + " equal members.");
            return;
        }
        
        System.out.println("");
        print(ragged);
        String[][][] holder = soRandom();
        holder = holoport(ragged, holder);
        System.out.println("");
        print(holder);
        System.out.println("");
        
        String inputCode = "";
        String inputLetters = "";
        int inputNumbers = 0;
        boolean valid = false;
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Now search for a code in the holoported version.");
        
        while(!valid){
            System.out.print("Please enter two capital letters: ");
            inputLetters = myScanner.next();
            
            boolean isLetters = wordChecker(inputLetters);
            
            if(!isLetters){
                System.out.println("Error: You must enter capital letters.");
            }
            else{
                if(inputLetters.length() > 2 || inputLetters.length() < 2){
                    System.out.println("Error: You must enter TWO capital letters.");
                }
                else{
                    valid = true;
                }
            }
        }
        
        valid = false;
        
        while(!valid){
            System.out.print("Please enter a 4 digit integer: ");
            if(myScanner.hasNextInt()){
                inputNumbers = myScanner.nextInt();
                int digits = (int) Math.log10(inputNumbers) + 1;
                if(digits != 4){
                    System.out.println("Error: You must enter FOUR digits.");
                }
                else{
                    valid = true;
                }
            }
            else{
                System.out.println("Error: You must enter integers.");
                String trash = myScanner.next();
            }
        }
        
        inputCode = (inputLetters + inputNumbers);
        sampling(inputCode, holder);
        
        double percentHoloport = percentage(ragged , holder);
        System.out.println("The holoportation percentage is: " + percentHoloport);
        
        frankenstein(holder);
        System.out.println("");
        print(holder);
    }
    
    public static String[][][] soRandom(){
        
        Random randomGenerator = new Random();
        int i = 0;
        int j = 0;
        
        String[][][] ragged = new String[randomGenerator.nextInt(9)+1][][];
        
        for(i=0;i<ragged.length;i++){
            ragged[i] = new String[randomGenerator.nextInt(9)+1][];
        }
        
        for(i=0;i<ragged.length;i++){
            for(j=0;j<ragged[i].length;j++){
                ragged[i][j] = new String[randomGenerator.nextInt(9)+1];
            }
        }
        
        return ragged;
    }
    
    public static String coder(){
        
        Random randomGenerator = new Random();
        String code = "";
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        String firstLetter = letters[randomGenerator.nextInt(26)];
        String secondLetter = letters[randomGenerator.nextInt(26)];
        
        code = ("" + firstLetter + secondLetter + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9)) + (randomGenerator.nextInt(9)));
        return code;
    }
    
    public static void print( String[][][] ragged){
        
        for(int i=0;i<ragged.length;i++){
            for(int j=0;j<ragged[i].length;j++){
                System.out.print("[");
                for(int k=0;k<ragged[i][j].length;k++){
                    if(k != ragged[i][j].length - 1){
                        System.out.print(ragged[i][j][k]+" , ");
                    }
                    else{
                        System.out.print(ragged[i][j][k]);
                    }
                }
                if(ragged[i][j].length == 0){
                    System.out.print("Extra second dimension array");
                }
                System.out.print("]");
                if(j != ragged[i].length - 1){
                    System.out.print(" | ");
                }
            }
            if(ragged[i].length == 0){
                System.out.print("{Extra first dimension array}");
            }
            if(i != ragged.length - 1){
                System.out.print(" --- ");
            }
        }
        System.out.println("");
    }
    
    public static String[][][] holoport(String[][][] object , String[][][] holder){
        int i = 0;
        int j = 0;
        int k = 0;
        
        if(holder.length<=object.length){
            for(i=0;i<holder.length;i++){
                if(holder[i].length<=object[i].length){
                    for(j=0;j<holder[i].length;j++){
                        if(holder[i][j].length<=object[i][j].length){
                            for(k=0;k<holder[i][j].length;k++){
                                holder[i][j][k] = object[i][j][k];
                            }
                        }
                        else{
                            for(k=0;k<object[i][j].length;k++){
                                holder[i][j][k] = object[i][j][k];
                            }
                            for(k=object[i][j].length;k<holder[i][j].length;k++){
                                holder[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                }
                else{
                    for(j=0;j<object[i].length;j++){
                        holder[i][j] = object[i][j];
                    }
                    for(j=object[i].length;j<holder[i].length;j++){
                        holder[i][j] = new String[0];
                    }
                }
            }
        }
        else{
            for(i=0;i<object.length;i++){
                holder[i] = object[i];
            }
            for(i=object.length;i<holder.length;i++){
                holder[i] = new String[0][];
            } 
        }
        return holder;
    }
    
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
        
        int i = 0;
        int j = 0;
        int k = 0;
        boolean found = false;
        
        outerloop:
        for(i=0;i<holder.length;i++){
            for(j=0;j<holder[i].length;j++){
                for(k=0;k<holder[i][j].length;k++){
                    if(inputCode.equals(holder[i][j][k])){
                        found = true;
                        break outerloop;
                    }
                }
            }
        }
        
        if(found){
            System.out.println("The code was found at the first dimension index: "+i+", second dimension index: "+j+", and member index: "+k+".");
            return;
        }
        else{
            System.out.println("The code was not found.");
            return;
        }
        
    }
    
    public static double percentage(String[][][] object , String[][][] holder){
        
        double holoportedMolecules = 0.0;
        double originalMolecules = 0.0;
        double percentHoloport = 0.0;
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(i=0;i<object.length;i++){
            for(j=0;j<object[i].length;j++){
                for(k=0;k<object[i][j].length;k++){
                    originalMolecules++;
                }
            }
        }
        
        for(i=0;i<holder.length;i++){
            for(j=0;j<holder[i].length;j++){
                for(k=0;k<holder[i][j].length;k++){
                    holoportedMolecules++;
                }
            }
        }
        
        percentHoloport = ((holoportedMolecules-originalMolecules)/originalMolecules)*100;
        return percentHoloport;
    }
    
    public static void frankenstein( String [][][] holder){
        
        int i = 0;
        int j = 0;
        int k = 0;
        String temp = "";
        
        for(i=0;i<holder.length;i++){
            for(j=0;j<holder[i].length;j++){
                for(k=1;k<holder[i][j].length;k++){
                    int currentMember = k;
                    while(holder[i][j][currentMember].compareTo(holder[i][j][currentMember-1]) < 0){
                        temp = holder[i][j][currentMember-1];
                        holder[i][j][currentMember-1] = holder[i][j][currentMember];
                        holder[i][j][currentMember] = temp;
                        currentMember--;
                        if(currentMember == 0){
                            break;
                        }
                    }
                }
            }
        }
        
        String[] tempArray;
        
        for(i=0;i<holder.length;i++){
            for(j=1;j<holder[i].length;j++){
                int currentArray = j;
                while(holder[i][currentArray].length < holder[i][currentArray-1].length){
                    tempArray = holder[i][currentArray-1];
                    holder[i][currentArray-1] = holder[i][currentArray];
                    holder[i][currentArray] = tempArray;
                    currentArray--;
                    if(currentArray == 0){
                        break;
                    }
                }
            }
        }
        return;
    }
}