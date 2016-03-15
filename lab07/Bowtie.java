//Jay Scudder
//Mar 11, 2016
//Lab 7: Bowtie
//program intended to take input and make a bowtie

import java.util.Scanner;

//define a class
public class Bowtie{
    
    //define a main method
    public static void main(String[] args){
        
                int nStars = 0; //declaring variables
                int i = 0;
                int k = 1;
        
                Scanner myScanner = new Scanner( System.in );
                
                while ((nStars < 3) || (nStars > 33)){ //while statement will continue to run until the input is an odd integer between 3 and 33 inclusively
                    
                    System.out.print("Enter an odd integer between 3 and 33 inclusively that you wish to create a bowtie for: "); //prompting the user for the bowtie size
                    if(myScanner.hasNextInt()){ //checking to see if the input is an integer
                
                        nStars = myScanner.nextInt(); //calling the Scanner method to receive a new input integer
                        if ((nStars < 3) || (nStars > 33)){ //if statement to determine whether or not input is erroneous
                            System.out.println("Error: You must enter an odd integer between 3 and 33 inclusively."); //printing an error message if input is <= 0
                        }
                        else if(nStars%2==0){
                            nStars = 0;
                            System.out.println("Error: You must enter and ODD integer."); //printing error message
                        }
                    }
                    else{ //if the input is not an integer
                        String trash = myScanner.next(); //this command assigns the erroneous input to a trash variable that will not be used in order to prevent infinite loop
                        System.out.println("Error: You must enter an integer."); //error message for the user
                    }
                } //end of while loop
                
                for (i=1;i<=nStars;i+=2){ //for loop that continues to run until the amount of rows of stars reaches the necessary number
                    
                    int j = 0; //initializing value of j which will be used to determine number of stars per row each time i is iterated
                    
                    for(j=1;j<=((nStars+1)-i);j++){ //for loop runs fully, printing the appropriate number of stars each time i is interated
                        System.out.print("*");
                    }
                    
                    if (i != nStars){ //stops the program from printing an extra line after the top half of the bowtie is finished
                        System.out.println(""); //sends the program to the next line
                    }
                    
                    while (k>=1){ //this while loop controls how many spaces are printed using variable k before the stars on each row begin
                        System.out.print(" ");
                        k--;
                    }
                    
                    switch (i){ //this switch statement adds the right value for the "spaces" variable k depending on what row of the bowtie the program is currently on
                        case 1:
                            k+=2;
                            break;
                        case 3:
                            k+=3;
                            break;
                        case 5:
                            k+=4;
                            break;
                        case 7:
                            k+=5;
                            break;
                        case 9:
                            k+=6;
                            break;
                        case 11:
                            k+=7;
                            break;
                        case 13:
                            k+=8;
                            break;
                        case 15:
                            k+=9;
                            break;
                        case 17:
                            k+=10;
                            break;
                        case 19:
                            k+=11;
                            break;
                        case 21:
                            k+=12;
                            break;
                        case 23:
                            k+=13;
                            break;
                        case 25:
                            k+=14;
                            break;
                        case 27:
                            k+=15;
                            break;
                        case 29:
                            k+=16;
                            break;
                    }
                }//end of for loop
                
                k = 1; //reseting k to its initial value of 1
                
                for(i=nStars;i>=1;i-=2){ //this for loop controls the printing of the second half of the bowtie
                
                    int j = 0; //again setting j = 0 each time i is iterated
                    
                    if (i != nStars){ //this if statement controls the printing of stars, but skips the first row to prevent double printing of the "1 star" line
                        
                        for(j=1;j<=((nStars+1)-i);j++){
                            System.out.print("*");
                        }
                        
                    }
                    
                    else{ //this else runs for the first part of the second half of the bowtie
                        switch (nStars){ //this switch statement controls how any spaces are to be printed for the first line of the second half of the bowtie
                            case 3:
                                k--;
                                break;
                            case 5:
                                k=0;
                                break;
                            case 7:
                                k++;
                                break;
                            case 9:
                                k+=2;
                                break;
                            case 11:
                                k+=3;
                                break;
                            case 13:
                                k+=4;
                                break;
                            case 15:
                                k+=5;
                                break;
                            case 17:
                                k+=6;
                                break;
                            case 19:
                                k+=7;
                                break;
                            case 21:
                                k+=8;
                                break;
                            case 23:
                                k+=9;
                                break;
                            case 25:
                                k+=10;
                                break;
                            case 27:
                                k+=11;
                                break;
                            case 29:
                                k+=12;
                                break;
                            case 31:
                                k+=13;
                                break;
                            case 33:
                                k+=14;
                                break;
                        }
                    }
                    
                    System.out.println(""); //sends the program to the next line for each iteration of i
                    
                    while (k>=1){ //another while statement similar to the first half that controls spaces
                        System.out.print(" ");
                        k--;
                    }
                    
                    switch (i){ //a switch statement similar to that used in the first half which controls number of spaces
                        case 1:
                            k-=2;
                            break;
                        case 3:
                            k--;
                            break;
                        case 5:
                            k=0;
                            break;
                        case 7:
                            k+=1;
                            break;
                        case 9:
                            k+=2;
                            break;
                        case 11:
                            k+=3;
                            break;
                        case 13:
                            k+=4;
                            break;
                        case 15:
                            k+=5;
                            break;
                        case 17:
                            k+=6;
                            break;
                        case 19:
                            k+=7;
                            break;
                        case 21:
                            k+=8;
                            break;
                        case 23:
                            k+=9;
                            break;
                        case 25:
                            k+=10;
                            break;
                        case 27:
                            k+=11;
                            break;
                        case 29:
                            k+=12;
                            break;
                        case 31:
                            k+=13;
                            break;
                        case 33:
                            k+=14;
                            break;
                    }
                }//end of for loop
    }//end of main method
}//end of public class