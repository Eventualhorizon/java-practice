/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

package basics.ProjectEulerIToX;


public class ProjectEulerTen {

    //reusing primeTesterExtended from ProjectEulerSeven
    //all primes must be in the form 30n + 1, 30 n + 7, 30n + 11, 30n + 13, 30n + 17, 30n + 19, 30n + 23, or 30n + 29
    //test each number to determine if it is in this form, and if it is use sieve of eratosthenes
    //NOTE: this version has been updated to correctly identify 2, 3, and 5 as prime numbers
    public static boolean primeTesterExtended(long number){

        if(number == 2 || number == 3 || number == 5){
            return true;
        }
        
        if(number % 30 == 1 || number % 30 == 7 || number % 30 == 11 || number % 30 == 13 || number % 30 == 17 || number % 30 == 19 || number % 30 == 23 || number % 30 == 29 ){
            double squareRoot = Math.floor(Math.sqrt(number)); //round down square root
            while(squareRoot > 6){
            if(number % squareRoot == 0){
                //System.out.println(number + "is not prime, has divisor " + squareRoot);
                return false;
            }
            squareRoot--;
        }
        //System.out.println(number + " is prime");
        return true;
        }
        return false;
    }

    public static void main(String[] args) {

        long sum = 0;

        for(long i = 2; i < 2000000; i++){
            if(primeTesterExtended(i)){
                sum += i;
            }
        }

        System.out.println("Sum of all primes under 2 million is " + sum);
        
    }
    
}
