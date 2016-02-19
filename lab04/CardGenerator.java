//Jay Scudder
//lab 04 Card Generator
//Feb 19, 2016
//Program designed to generate a random number which corresponds to a playing card

//define a class
    public class CardGenerator{
        
    //define a method
        public static void main(String[] args){
            
            int randomCard = (int) (Math.random()*(53))+1; //picking a random number between 1 and 52
            String cardIdentity = ""; //declaring variables for use later so they aren't being continually declared
            String cardSuit = "";
            
            //series of if statements that decide the suit based on a range of numbers
            if ((randomCard >= 1) && (randomCard <= 13)){
                cardSuit = "Diamonds";
            }
            if ((randomCard >= 14) && (randomCard <= 26)){
                cardSuit = "Clubs";
            }
            if ((randomCard >= 27) && (randomCard <= 39)){
                cardSuit = "Hearts";
            }
            if ((randomCard >= 40) && (randomCard <= 52)){
                cardSuit = "Spades";
            }
            
            //switch statement to decide the card identity
            
            switch (randomCard){
                case 1:
                    cardIdentity = "Ace";
                    break;
                case 11:
                    cardIdentity = "Jack";
                    break;
                case 12:
                    cardIdentity = "Queen";
                    break;
                case 13:
                    cardIdentity = "King";
                    break;
                case 14:
                    cardIdentity = "Ace";
                    break;
                case 24:
                    cardIdentity = "Jack";
                    break;
                case 25:
                    cardIdentity = "Queen";
                    break;
                case 26:
                    cardIdentity = "King";
                    break;
                case 27:
                    cardIdentity = "Ace";
                    break;
                case 37:
                    cardIdentity = "Jack";
                    break;
                case 38:
                    cardIdentity = "Queen";
                    break;
                case 39:
                    cardIdentity = "King";
                    break;
                case 40:
                    cardIdentity = "Ace";
                    break;
                case 50:
                    cardIdentity = "Jack";
                    break;
                case 51:
                    cardIdentity = "Queen";
                    break;
                case 52:
                    cardIdentity = "King";
                    break;
                default:
                    cardIdentity = ""+ (randomCard%13); //this line makes it so that the card identity is the number of the card rather than a special name
                    break;
            }
            
            System.out.println("You picked "+cardIdentity+" of "+cardSuit); //printing the card that was chosen at random
            
        }
    }