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

    public static void processArrayOne ([] arrayOne){
        final int distance; //this is the specified distance to be reached between coordinates
        int output = arrayOne[0]; //starting output
        for (int i=1; i < arrayOne.length; i++){
            if(math.abs((arrayOne[i] - output)) >= distance){
                output = arrayOne[i];
                System.out.println(output);
            }
        }
    }

    public static void processArrayTwo([] arrayTwo){
        final int distance; //this is the specified distance to be reached between coordinates
        int startingPoint = arrayOne[0]; //starting output
        for (int i=1; i < arrayTwo.length; i++){
            if((i >= 5) && math.abs((arrayTwo[i] - startingPoint)) >= distance){
                System.out.println(output);
            }
            startingPoint = arrayTwo[i-5];
        }
    }
}
