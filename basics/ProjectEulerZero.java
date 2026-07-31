/*
A number is a perfect square, or a square number, if it is the square of a positive integer.
For example,
25 is a square number because
5 x 5 = 25; it is also an odd square.

The first 5 square numbers are: 1, 4, 9, 16, 25
and the sum of the odd squares is 35.

Among the first 821 thousand square numbers, what is the sum of all the odd squares?
*/

//key insight is that all odd numbers will yield an odd square number, because no odd number can have 2 as one of its prime factors
//so no odd square number can have 2 as one of its prime factors

package basics;

public class ProjectEulerZero {
    public static void main(String[] args){
        double count = 0; //keeps track of final amount
        for(int i = 1; i<=821000; i+=2){ //loops through the first 821000 numbers, counting only the odds
            count+=i*i;
        }
        System.out.println(count);
    }
}
