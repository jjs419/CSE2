//Jay Scudder
//Apr 22, 2016
//lab 12 2D Ragged Array

import java.util.Scanner;
import java.util.Random;

//define class
public class Ragged{
    
    public static void main(String[] args){
        
        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner( System.in );
        int size = 0;
        
        System.out.print("Enter an integer for the size of the container array: ");
        size = myScanner.nextInt();
        
        int[][] array = new int[size][];
        int i = 0;
        
        for(i=0;i<size;i++){
            array[i] = new int[randomGenerator.nextInt(size-1)+1];
        }
        
        int j = 0;
        
        for(i=0;i<size;i++){
            for(j=0;j<array[i].length;j++){
                array[i][j] = randomGenerator.nextInt(21);
            }
        }
        
        System.out.println("The array is: ");
        
        for(i=0;i<size;i++){
            for(j=0;j<array[i].length;j++){
                if(j<(array[i].length - 1)){
                    System.out.print(array[i][j] + ", ");
                }
                else{
                    System.out.println(array[i][j]);
                }
            }
        }
        
        int temp = 0;
        
        for(i=0;i<size;i++){
            for(j=1;j<array[i].length;j++){
                int currentNumber = j;
                while(array[i][currentNumber] < array[i][currentNumber-1]){
                    temp = array[i][currentNumber-1];
                    array[i][currentNumber-1] = array[i][currentNumber];
                    array[i][currentNumber] = temp;
                    currentNumber--;
                    if(currentNumber == 0){
                        break;
                    }
                }
            }
        }
        
        System.out.println("");
        System.out.println("The sorted array is: ");
        
        for(i=0;i<size;i++){
            for(j=0;j<array[i].length;j++){
                if(j<(array[i].length - 1)){
                    System.out.print(array[i][j] + ", ");
                }
                else{
                    System.out.println(array[i][j]);
                }
            }
        }
        
        int[] tempArray;
        
        for(i=1;i<size;i++){
            int currentArray = i;
            while(array[currentArray].length < array[currentArray-1].length){
                tempArray = array[currentArray-1];
                array[currentArray-1] = array[currentArray];
                array[currentArray] = tempArray;
                currentArray--;
                if(currentArray == 0){
                    break;
                }
            }
        }
        
        System.out.println("");
        System.out.println("The rearranged array is: ");
        
        for(i=0;i<size;i++){
            for(j=0;j<array[i].length;j++){
                if(j<(array[i].length - 1)){
                    System.out.print(array[i][j] + ", ");
                }
                else{
                    System.out.println(array[i][j]);
                }
            }
        }
        
        System.out.println("");
        System.out.print("Enter a value to be searched for: "); //prompt
        int search = myScanner.nextInt();
        boolean found = false; //initializing
        
        for(i=0;i<size;i++){
            for(j=0;j<array[i].length;j++){
                if(array[i][j] == search){
                    System.out.println("The value was found in row " + (i+1) + " and column " + (j+1) + ".");
                    found = true;
                }
            }
        }
        
        if(!found){
            System.out.println("The number was not found in the list.");
        }
        
    }
}