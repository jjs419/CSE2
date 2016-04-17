//Jay Scudder
//hw11 Remove Elements
//April 15, 2016

import java.util.Scanner;
import java.util.Random;

public class RemoveElements{
    
    public static void main(String [] arg){
      
	    Scanner scan=new Scanner(System.in);
	
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
        String answer="";
        do{
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
            newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer=scan.next();
	    }while(answer.equals("Y") || answer.equals("y"));
    }
 
    public static String listArray(int num[]){
	    String out="{";
	    for(int j=0;j<num.length;j++){
	        
  	        if(j>0){
    	        out+=", ";
  	        }
  	        out+=num[j];
	    }
	    out+="} ";
	    return out;
    }
    
    public static int[] randomInput(){ //method returns an array of random ints
        int[] array = new int[10]; //allocating size
        Random randomGenerator = new Random(); //random object
        
        for(int i=0;i<10;i++){
            array[i] = randomGenerator.nextInt(10); //sets each member of the array to a random int [0-9]
        }
        return array; //returns the finished array
    }
    
    public static int[] delete(int[] list, int pos){ //accepts and array and an integer, returns array
        
        if( pos > 9 || pos < 0){ //checking to see if the index choice is within valid range
            System.out.println("The index is not valid.");
            return list; //return unchanged list if index invalid
        }
        int[] newList = new int[9]; //allocate a new list of size 1 less than original
        int i = 0; //initializing variable
        
        for(i=0;i<pos;i++){
            newList[i] = list[i]; //assigning each member of the original list to the new list up until the input index
        }
        
        for(i=pos;i<9;i++){ //starting at the input index, skip over the number in [pos] when assigning
            newList[i] = list[i+1];
        }
        
        return newList; //returns the new list with the [pos] member removed
    }
    
    public static int[] remove(int[] list, int target){ //accepts array and int, returns array
        
        int i = 0;          //initializing
        int j = 0;          //
        int numTargets = 0; //
        
        for(i=0;i<10;i++){ 
            if(list[i] == target){ //counts how many times the target appears in the array
                numTargets++;
            }
        }
        
        int[] newList = new int[10-numTargets]; //new list that is as big as the original minus all members that are the target
        boolean assigned = false; //initializing
        
        for(i=0;i<(10-numTargets);i++){ //for each member of the new list...
            while(!assigned){ //continues to run until the current member of the new list is assigned a value
                while(j<10){ //loops through the original list
                    if(list[j] != target){ //if the current member of the original list is not a target number, then assign the value to the new list member
                        newList[i] = list[j];
                        assigned = true;
                        j++;
                        break; //breaks out of the inner most while once the newList member is assigned so that the first for loop can interate to the next newList member
                    }
                    j++;
                }
            }
            assigned = false; //resets assigned variable for the next member of newList
        }
        return newList; //return the end product with targets removed
    }
}
