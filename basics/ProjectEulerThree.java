/*The prime factors of 13195 are 5, 7, 13, and 29.

What is the largest prime factor of the number 600851475143?

 */

//we could solve this by taking the square root and testing each integer below sqrt to see if it is a multiple

package basics;


public class ProjectEulerThree {
    public static void main(String [] args){
        final long number = 600851475143L; //have to add L to a literal in java or else it's automatically cast as int
        final double testMultiple = Math.floor(Math.sqrt(number));
        while(testMultiple > 0){
            if(number%testMultiple == 0){
                
            }
        }
    }
}
