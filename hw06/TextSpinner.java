//Jay Scudder
//Mar 6, 2016
//homework 6: Text Spinner
//program intended to show a spinning text

//define a public class
    public class TextSpinner{
        
        //define a main method
            public static void main(String[] args){
                
                while (true){ //while statement always runs
                    
                    System.out.print("\b"+"/"); //backspaces previous symbol and prints the next one
                    System.out.print("\b"+"-");
                    System.out.print("\b"+"\\");
                    System.out.print("\b"+"|");
                    
                } //end of while statement
            } //end of main method
    } //end of public class