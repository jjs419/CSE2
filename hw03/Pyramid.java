//Jay Scudder
//Homework 3
//Feb 16, 2016
//Program 2, intended to return the volume of a pyramid

import java.util.Scanner; //importing the Scanner class for use

//define a class
    public class Pyramid{
        
    //define a method
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in ); //creating an instance of Scanner for use
            
            System.out.print("The square side of the pyramid is (input length): "); //length of one side of base, needed for area of square base
            double baseLength = myScanner.nextDouble(); //calling for the next double Scanner method
            
            System.out.print("The height of the pyramid is (input length): "); //asking for input of height
            double pyrHeight = myScanner.nextDouble();
            
        //being calculations
        
            double areaBase = Math.pow( baseLength, 2 ); //squaring the base length to find area
            double pyrVolume = (areaBase*pyrHeight)/3; //finding the volume of the pyramid
            
        //end calculations, print answer
        
            System.out.println("The volume of the pyramid is " + pyrVolume); 
        } //end main method
    } //end class