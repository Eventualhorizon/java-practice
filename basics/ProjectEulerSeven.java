/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the
6th prime is 13.

What is the
10001st prime number?

Fast way to test a number to see if it is prime:

All prime numbers must be in the form 30n + 1, 30 n + 7, 30n + 11, 30n + 13, 30n + 17, 30n + 19, 30n + 23, or 30n + 29
 */

package basics;

public class ProjectEulerSeven {

    //all primes must be in the form 30n + 1, 30 n + 7, 30n + 11, 30n + 13, 30n + 17, 30n + 19, 30n + 23, or 30n + 29
    //test each number to determine if it is in this form, and if it is use sieve of eratosthenes
    public static boolean primeTesterExtended(long number){
        
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

    public static void main(String[] args){

        int potentialPrime = 7;
        int[] primeList = new int[10001];
        primeList[0] = 2;
        primeList[1] = 3;
        primeList[2] = 5;

        for(int i = 3; i < 10001; i++){
            while(primeList[i] == 0){
                if(primeTesterExtended(potentialPrime)){
                    primeList[i] = potentialPrime;
                    potentialPrime += 2; // can count by twos because every other number will be even
                }else{
                    potentialPrime += 2;
                }
        }
        }

        System.out.println("The 10001th prime number is " + primeList[10000]);

    }
    
}
