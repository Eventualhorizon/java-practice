/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two
2-digit numbers is 91 x 99 = 9009
.

Find the largest palindrome made from the product of two
3-digit numbers
*/

package basics.ProjectEulerIToX;


public class ProjectEulerFour {
    //create array that includes all palindrome numbers that are multiples of 3-digit numbers
    //will be more than 100x100 and less than 999x999 so they are all 5 or 6 digit numbers
    //then go through array and check each element to determine if it is a multiple of a 3 digit number

    //method to determine if a number is three-digit
    //receives: double
    //returns: boolean (true if three digit, false if not)
    public static boolean threeDigitChecker(double number){
        if(number >= 100 && number < 1000){
            return true;
        }
            return false;
        }
    public static void main(String[] args){

        double[] palindromeList = new double[1800]; //900 5 digit palindromes and 900 6 digit palindromes will go in an array of size 1800

        //SIX DIGIT PALINDROME GENERATOR
        int counter = 999; //counter will provide first three digits for all 6 digit palindromes
        double palindrome = 0;
        double onesPlace = 0;
        double tensPlace = 0;
        double hundredsPlace = 0;

        //start by populating array with all 6 digit palindromes
        for (int i = 0; i<900; i++){
            palindrome = counter * 1000; //first three digits of 6-digit palindrome
            onesPlace = (Math.floor(counter/100)); //find ones place by dividing counter by 100 and rounding down
            tensPlace = (Math.floor((counter % 100)/10) * 10); //find tens place by taking counter mod 100, dividing by 10, rounding down, and multiplying by 10
            hundredsPlace = (counter % 10) * 100; //find hundreds place by taking the digit's ones place and multiplying by 100
            palindrome += onesPlace + tensPlace + hundredsPlace;
            palindromeList[i] = palindrome;
            counter--;
        }

        //FIVE DIGIT PALINDROME GENERATOR
        //I feel bad about this but for the sake of speed I'm just going to initialize a whole bunch of new variables to generate all the 5 digit palindromes
        //It is what it is
        int newCounter = 999; //counter will provide first three digits for all 5 digit palindromes
        double newPalindrome = 0;
        double newOnesPlace = 0;
        double newTensPlace = 0;
        //finish populating array with all 5 digit palindromes
        for (int i = 900; i<1800; i++){
            newPalindrome = newCounter * 100; //first three digits of 5-digit palindrome, multiplying by 100 rather than 1000
            newOnesPlace = (Math.floor(newCounter/100)); //find ones place by dividing counter by 100 and rounding down
            newTensPlace = (Math.floor((newCounter % 100)/10) * 10); //find tens place by taking counter mod 100, dividing by 10, rounding down, and multiplying by 10
            newPalindrome += newOnesPlace + newTensPlace; //keep in mind we don't need a new hundreds place as this is already provided
            palindromeList[i] = newPalindrome;
            newCounter--;
        }

        /* 
        for (int i = 1200; i < 1225; i++){
            System.out.println(palindromeList[i]);
        }
        */
        //PALINDROME FACTOR CHECKER
        /*
        For each palindrome in the array, find the square root, then check each integer lower than the square root to see if
        it evenly divides the palindrome. If it does, find out if the other divisor is also a three digit number.
        Palindromes are already sorted from largest to smallest so as soon as you find one, you're done.
         */


        int brake = 0;
        int palindromeListStepper = 0;
        while(brake == 0 && palindromeListStepper < 1800){
            double divisor = Math.floor(Math.sqrt(palindromeList[palindromeListStepper]));
            while(divisor > 0){
                if(palindromeList[palindromeListStepper] % divisor == 0 && threeDigitChecker(divisor) && threeDigitChecker(palindromeList[palindromeListStepper]/divisor)){
                    System.out.println("The largest palindrome number that is a multiple of two three-digit numbers is " + palindromeList[palindromeListStepper]);
                    System.out.println("The three-digit numbers are " + divisor + " and " + palindromeList[palindromeListStepper]/divisor);
                    brake = 1;
                    break;
                }
                divisor--;
            }
            palindromeListStepper++;
        }




    }

}
