//Jay Scudder
//hw11 CSE2Linear
//April 15, 2016

import java.util.Scanner;

public class CSE2Linear{ //define class
    
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner( System.in ); //instance of scanner
        int[] studentGrades = new int[15]; //allocating new list
        int i = 0;             //initializing
        int grade = 0;         //
        boolean valid = false; //
        
        for(i=0;i<15;i++){ //to assign each member of the list
            
            while(!valid){ //while the entered grade is not valid
                
                System.out.print("Enter a grade: "); //prompt
                
                if(myScanner.hasNextInt()){ //if the input is an integer
                    
                    grade = myScanner.nextInt(); //assign grade to the input
                    
                    if(grade < 0 || grade > 100){ //if not in valid range
                        System.out.println("Error: You must enter an integer within 0 and 100.");
                    }
                    
                    if(i>0 && grade < studentGrades[i-1]){ //after the first grade, if the input is less than the previous input
                        System.out.println("Error: You must enter a grade greater than the previous grade.");
                    }
                    
                    else{ //if none of the invalid conditions were satisfied, set the member equal to the input grade
                        studentGrades[i] = grade;
                        valid = true; //the input is valid
                    }
                }
                
                else{ //if the input is not an integer
                    System.out.println("Error: You must enter an integer.");
                    String trash = myScanner.next(); //trash variable to get rid of the input
                }
            }
            valid = false; //resets valid for the next member of the list
        }
        
        System.out.println("The list is:");
        for(i=0;i<15;i++){ //prints the full list
            System.out.println(studentGrades[i]);
        }
        
        System.out.print("Enter a grade to be searched for: "); //prompt
        int searchGrade = myScanner.nextInt(); //initializing
        boolean found = false;                 //
        int middle = 0;                        //
        int end = 14;                           //
        int beginning = 0;                     //
        int iterations = 1;                    //
        
        while(!found){ //while the number is not found
            
            middle = (int) ((end-beginning)/2 + beginning); //sets the index to be looked at
            if(studentGrades[middle] == searchGrade){ //if the index being looked at is the search number
                System.out.println("The number was found in the list after " + iterations + " iterations.");
                found = true;
                break;
            }
            else if(studentGrades[middle] > searchGrade){ //if the index being looked at is larger than the search
                end = middle - 1; //changes the array length to the first half
                iterations++;
            }
            else if(studentGrades[middle] < searchGrade){ //if the index being looked at is shorter than the search
                beginning = middle + 1; //changes the array length to the second half
                iterations++;
            }
            else if(end == beginning){ //if the value was not found
                System.out.println(searchGrade + " was not found in the list.");
                break;
            }
        }
        
        int temp = 0; //initializing
        int j = 0;    //initializing
        
         for(j=1;j<=10;j++){ //repeat the scrambling process 10 times
            for(i=1;i<15;i++){ //for each member of the list
                if(Math.random() <= .5){ //~half the time it swaps two members
                    temp = studentGrades[i-1]; //set the temp variable equal to the value of the previous member
                    studentGrades[i-1] = studentGrades[i]; //set the previous member value to the current member value
                    studentGrades[i] = temp; //set the current member value to the temp value, which is the previous member value
                }
            }
         }
        
        System.out.println("The scrambled list is:");
        for(i=0;i<15;i++){
            System.out.println(studentGrades[i]); //print new list
        }
        
        System.out.print("Enter a grade to be searched for: "); //prompt
        searchGrade = myScanner.nextInt();
        found = false; //initializing
        
        for(i=0;i<15;i++){ //same search as before
            if(studentGrades[i] == searchGrade){
                System.out.println("The grade was found after " + (i+1) + " iterations.");
                found = true;
            }
            if(!found && i == 14){
                System.out.println("The grade was not found after 15 iterations.");
            }
        }
    }
}