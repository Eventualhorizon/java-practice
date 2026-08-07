/*The prime factors of 13195 are 5, 7, 13, and 29.

What is the largest prime factor of the number 600851475143?

 */

//we could solve this by taking the square root and testing each integer below sqrt to see if it is a multiple

package basics.ProjectEulerIToX;


public class ProjectEulerThree {

    //class to determine if a number is prime or not using sieve of eratosthenes
    //take a number, determine its square root (rounded down)
    //then check every number from the square root to 2 to see if it is a factor
    //returns true if it has no factors i.e. is a prime number, false otherwise
    public static boolean primeChecker(double number){
        double squareRoot = Math.floor(Math.sqrt(number)); //round down square root
        while(squareRoot > 1){
            if(number % squareRoot ==0){
                //System.out.println(number + "is not prime, has divisor " + squareRoot);
                return false;
            }
            squareRoot--;
        }
        System.out.println(number + " is prime");
        return true;
    }
    public static void main(String [] args){
        final long number = 600851475143L; //have to add L to a literal in java or else it's automatically cast as int
        double numberBeingTested = Math.floor(Math.sqrt(number));
        double currentLargestPrime = 0; //keep track of the largest prime number
        while(numberBeingTested > 1){
            if(number%numberBeingTested == 0){
                double otherDivisor = number/numberBeingTested; //create a variable for the other divisor
                if(primeChecker(numberBeingTested) && numberBeingTested > currentLargestPrime){
                    currentLargestPrime = numberBeingTested;
                } else if(primeChecker(otherDivisor) && otherDivisor > numberBeingTested){
                    currentLargestPrime = otherDivisor;
                }
            }
            numberBeingTested-=1;
        }
        System.out.println("Largest prime factor is " + currentLargestPrime);
        }
}

//the problem is probably with my prime checker because it's claiming too many things are prime, need to test it
