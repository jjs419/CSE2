//Jay Scudder
//February 5th, 2016
//CSE 002
//Lab 02 Cyclometer program
    //Intended to:
    //print number of minutes for each bicycle trip
    //print number of rotations of the wheel for each trip
    //print the distance of each trip in miles
    //print the total distance of both trips together
    
//Define class
    public class Cyclometer {
        //main method
        public static void main (String[] args) {
            
            //input data
                
                int secsTrip1=480; //seconds it took to complete the first trip
                int secsTrip2=3220; //seconds it took to complete the second trip
                int countsTrip1=1561; //number of wheel rotations during trip 1
                int countsTrip2=9037; //number of wheel rotations during trip 2
                
            //useful constants
            
                double wheelDiameter=27.0, //Diameter of the bike wheel in inches
                PI=3.14159, //the variable pi, useful in calculations involving circles
                feetPerMile=5280, //the number of feet that constitutes one mile
                inchesPerFoot=12, //number of inches in one foot
                secondsPerMinute=60; //number of seconds that constitutes one mile
                double distanceTrip1, distanceTrip2, totalDistance; //declaring these variables as doubles for later use
                
            //printing out phrases that include the above input data
            
                System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
                System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
                
            //calculating distance values
            
                distanceTrip1=wheelDiameter*PI*countsTrip1; 
                    //This line calculates the distance of the first trip in inches. 
                    //The distance is the number of rotations multiplied by the circumference of the wheel, which is wheelDiamater times the constant PI
                distanceTrip1/=inchesPerFoot*feetPerMile; //This line converts the units of distance from inches to miles
                distanceTrip2=(wheelDiameter*PI*countsTrip2)/(inchesPerFoot*feetPerMile); //this line is a condensed form of what was done in the two previous lines for distanceTrip1
                totalDistance=distanceTrip1+distanceTrip2; //simple addition of both trips to get the total distance traveled
                
            //printing out the aforementioned distances
                
                System.out.println("Trip 1 was "+distanceTrip1+" miles.");
                System.out.println("Trip 2 was "+distanceTrip2+" miles.");
                System.out.println("Total distance was "+totalDistance+" miles.");
                
        } //end of main method
    } //end of class
