//Jay Scudder
//Mar 25, 2016
//lab08: program designed to use methods to print random sentences

import java.util.Random; //importing the random method to make random numbers

//define a class
public class RandomSentence{
    
    
    
    public static String myAdjective(){ //method to return and adjective
        
        Random randomGenerator = new Random(); //creating the random object
        String adjective = ""; //initializing variable
        int randomInt = 0; //initializing random number variable
        
        randomInt = randomGenerator.nextInt(10); //setting randomInt to a random integer between less than 10
        
        switch(randomInt){
            case 0:
                adjective = "quick";
                break;
            case 1:
                adjective = "funny";
                break;
            case 2:
                adjective = "brown";
                break;
            case 3:
                adjective = "green";
                break;
            case 4:
                adjective = "slimy";
                break;
            case 5:
                adjective = "cute";
                break;
            case 6:
                adjective = "fluffy";
                break;
            case 7:
                adjective = "tasty";
                break;
            case 8:
                adjective = "stupid";
                break;
            case 9:
                adjective = "greasy";
                break;
        }
        return adjective;
    }
    
    public static String myNounSubject(){
        
        Random randomGenerator = new Random(); //creating the random object
        String nounSubject = ""; //initializing variable
        int randomInt = 0; //initializing random number variable
        
        randomInt = randomGenerator.nextInt(10); //setting randomInt to a random integer between less than 10
        
        switch(randomInt){
            case 0:
                nounSubject = "fox";
                break;
            case 1:
                nounSubject = "cat";
                break;
            case 2:
                nounSubject = "father";
                break;
            case 3:
                nounSubject = "mother";
                break;
            case 4:
                nounSubject = "alligator";
                break;
            case 5:
                nounSubject = "eagle";
                break;
            case 6:
                nounSubject = "bug";
                break;
            case 7:
                nounSubject = "spider";
                break;
            case 8:
                nounSubject = "teacher";
                break;
            case 9:
                nounSubject = "frycook";
                break;
        }
        return nounSubject;
    }
    
    public static String myPastVerb(){
        
        Random randomGenerator = new Random(); //creating the random object
        String pastVerb = ""; //initializing variable
        int randomInt = 0; //initializing random number variable
        
        randomInt = randomGenerator.nextInt(10); //setting randomInt to a random integer between less than 10
        
        switch(randomInt){
            case 0:
                pastVerb = "kicked";
                break;
            case 1:
                pastVerb = "shot";
                break;
            case 2:
                pastVerb = "bludgeoned";
                break;
            case 3:
                pastVerb = "touched";
                break;
            case 4:
                pastVerb = "rubbed";
                break;
            case 5:
                pastVerb = "licked";
                break;
            case 6:
                pastVerb = "ran over";
                break;
            case 7:
                pastVerb = "slew";
                break;
            case 8:
                pastVerb = "smacked";
                break;
            case 9:
                pastVerb = "poked";
                break;
        }
        return pastVerb;
    }
    
    public static String myNounObject(){
        
        Random randomGenerator = new Random(); //creating the random object
        String nounObject = ""; //initializing variable
        int randomInt = 0; //initializing random number variable
        
        randomInt = randomGenerator.nextInt(10); //setting randomInt to a random integer between less than 10
        
        switch(randomInt){
            case 0:
                nounObject = "fly";
                break;
            case 1:
                nounObject = "dog";
                break;
            case 2:
                nounObject = "ball";
                break;
            case 3:
                nounObject = "tv";
                break;
            case 4:
                nounObject = "pizza";
                break;
            case 5:
                nounObject = "chair";
                break;
            case 6:
                nounObject = "insect";
                break;
            case 7:
                nounObject = "rug";
                break;
            case 8:
                nounObject = "grass";
                break;
            case 9:
                nounObject = "dirt";
                break;
        }
        return nounObject;
    }
    
    public static void main(String[] args){ //the main method
        String adjective = myAdjective();     //calling the methods
        String nounSubject = myNounSubject(); //
        String pastVerb = myPastVerb();       //
        String nounObject = myNounObject();   //
        String adjective2 = myAdjective();    //
        
        System.out.println("The "+adjective+" "+nounSubject+" "+pastVerb+" the "+adjective2+" "+nounObject+".");
        
    }
    
}