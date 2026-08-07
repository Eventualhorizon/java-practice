/*
A number is a perfect square, or a square number, if it is the square of a positive integer.
For example,
25 is a square number because
5 x 5 = 25; it is also an odd square.

The first 5 square numbers are: 1, 4, 9, 16, 25
and the sum of the odd squares is 35.

Among the first 821 thousand square numbers, what is the sum of all the odd squares?
*/

//key insight is that every odd number will yield an odd square number, because no odd number can have 2 as one of its prime factors
//so every square of an odd number does not have 2 as one of its prime factors, meaning that it is an odd square number
//and no square of an even number can be an odd square because it will have 2 as one of its prime factors

package basics.ProjectEulerIToX;

public class ProjectEulerZero {
    public static void main(String[] args){
        long amount = 0; //keeps track of final amount
        for(long i = 1; i<=821000; i+=2){ //loops over the first 821000 positive integers, counting every odd number
            amount+=i*i; //multiply root by itself and add the product to amount
        }
        System.out.println(amount);
    }
}
