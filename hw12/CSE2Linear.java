//Jay Scudder
//hw11 CSE2Linear
//April 15, 2016

import java.util.Scanner;

public class CSE2Linear{ //define class
    
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner( System.in );
        int[] studentGrades = new int[15];
        int i = 0;
        int grade = 0;
        boolean valid = false;
        
        for(i=0;i<15;i++){
            
            while(!valid){
                
                System.out.print("Enter a grade: ");
                
                if(myScanner.hasNextInt()){
                    
                    grade = myScanner.nextInt();
                    
                    if(grade < 0 || grade > 100){
                        System.out.println("Error: You must enter an integer within 0 and 100.");
                    }
                    
                    if(i>0 && grade < studentGrades[i-1]){
                        System.out.println("Error: You must enter a grade greater than the previous grade.");
                    }
                    
                    else{
                        studentGrades[i] = grade;
                        valid = true;
                    }
                }
                
                else{
                    System.out.println("Error: You must enter an integer.");
                    String trash = myScanner.next();
                }
            }
            valid = false;
        }
        
        System.out.println("The list is:");
        for(i=0;i<15;i++){
            System.out.println(studentGrades[i]);
        }
        
        System.out.print("Enter a grade to be searched for: ");
        int searchGrade = myScanner.nextInt();
        boolean found = false;
        
        for(i=0;i<15;i++){
            if(studentGrades[i] == searchGrade){
                System.out.println("The grade was found after " + (i+1) + " iterations.");
                found = true;
            }
            if(!found && i == 14){
                System.out.println("The grade was not found after 15 iterations.");
            }
        }
        
        int temp = 0;
        int j = 0;
        
         for(j=1;j<=10;j++){
            for(i=1;i<15;i++){
                if(Math.random() <= .5){
                    temp = studentGrades[i-1];
                    studentGrades[i-1] = studentGrades[i];
                    studentGrades[i] = temp;
                }
            }
         }
        
        System.out.println("The scrambled list is:");
        for(i=0;i<15;i++){
            System.out.println(studentGrades[i]);
        }
        
        System.out.print("Enter a grade to be searched for: ");
        searchGrade = myScanner.nextInt();
        found = false;
        
        for(i=0;i<15;i++){
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