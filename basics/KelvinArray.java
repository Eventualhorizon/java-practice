//my friend Kelvin shared the following prompt:
//friend had an interview, here's the questions if you were interested
//Given array of coordinates where index = seconds since start 
//(0 = position at start, 1 = position at 1s, etc)
//Pt1: Output whenever certain distance from previous output has been reached. 
//Initial output is starting coordinates
//Pt2: Output whenever certain distance has been traveled across past 5 indexes 

//I am making the assumption that the coordinates are on a 1-dimensional plot
//i.e. a number line
//for simplicity each element of the array is an integer
//if the question were to ask about an array of (x, y) coordinates
//we would just do the same thing but with an array of arrays (does Java have those?)
//and measure the distance between elements using pythagorean theorem

package basics;

public class KelvinArray {

    //create an object to represent coordinates on a two-dimensional plane 
    public class Coordinate {
        double x;
        double y;

        public Coordinate(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    //measure distance between two coordinates on two-dimensional plane by adding the squares of the differences in x values and y values
    public static double measureDistance(Coordinate coordinateOne, Coordinate coordinateTwo){
        double measuredDistance = Math.sqrt(Math.pow((coordinateOne.x - coordinateTwo.x), 2) + (Math.pow((coordinateOne.y - coordinateTwo.y), 2)));
        return measuredDistance;
    }

    //output whenever certain distance from previous output has been reached, first output is 0th element of array
    public static void processArrayOne ([] arrayOne){
        final double distance; //this is the specified distance to be reached between coordinates
        Coordinate output = new Coordinate(arrayOne[0].x, arrayOne[0].y); //first output is the 0th element of the array
        System.out.println(output.c, output.y); //initial output is the 0th element of the array

        for (int i=1; i < arrayOne.length; i++){

            //for each iteration, measure distance by adding the squares of the differences in x values and y values
            double measuredDistance = measureDistance(arrayOne[i], output);

            //if the distance between the ith element of the array and the current 'output' variable is greater
            //than the specified distance, update the current output to be the ith element and print the coordinates
            if(measuredDistance >= distance){
                output = arrayOne[i];
                System.out.println("Distance reached at array index " + i);
            }
        }
    }

    //output whenever certain distance has been travelled across past 5 indices
    public static void processArrayTwo([] arrayTwo){
        final double distance; //this is the specified distance to be travelled after five indices
        Coordinate startingPoint = arrayOne[0]; //start at first element of array
        double distanceTravelled; //initialize variable to keep track of distance travelled past coordinates

        //we will start by measuring the distance travelled after the 0th through 4th indices
        for (int i = 1; i<5; i++){
            distanceTravelled += measureDistance(arrayTwo[i], arrayTwo[i-1]);
        }
        if (distanceTravelled >= distance){
            System.out.println("Distance travelled after array index 4");
        }
        //for array indices 5 onward, continue to update distanceTravelled variable by adding distance travelled from
        //i-1 to ith element and subtracting the distance travelled from i-5th to i-4th element
        for (int i=5; i < arrayTwo.length; i++){
            distanceTravelled += measureDistance(arrayTwo[i], arrayTwo[i-1])//add distance from i-1th to ith element
            distanceTravelled -= measureDistance(arrayTwo[i-4], arrayTwo[i-5]); //subtract distance from i-5th to i-4th element
            if(distanceTravelled >= distance){
                System.out.println("Distance travelled after array index " + i);
            }
            }
        }
    }

