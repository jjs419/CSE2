


import java.util.Scanner;

    public class Tests{
        
        public static void main(String[] args){
            
            Scanner myScanner = new Scanner( System.in );
            
            System.out.print("Enter input: ");
            int myInt = myScanner.nextInt();
            
            switch (myInt){
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("Not 2, 3 or 4.");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                
            }
        }
    }