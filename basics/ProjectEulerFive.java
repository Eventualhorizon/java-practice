/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

/*
recall that a lot of these numbers are also multiples of each other
20 = 4*5 and 2*10
18 = 6*3 and 2*9
16 = 2*8
14 = 2*7
So if something is a multiple of the numbers 20-11 it will also be a multiple of 1-10
So upper bound is 20*19*18*17*16*15*14*13*12*11 = 670442572800
also it must have all of the prime factors in it
so at a minimum it is 2*3*5*7*11*13*17*19 = 9699690
and whatever it is will be a multiple of 9699690

Ultimately I was stuck finding a solution to this problem by naive testing. So instead I just identified the prime factors of every number
from 1 - 20 and identified the number that included all of the unique prime factors, which is 232792560
*/

package basics;

public class ProjectEulerFive {
    
    public static void main(String[] args){

        int brake = 0;
        double testNumber = 9699690; //minimum number, will count up from here
        final double limit = 670442572800L; //limit is product of all numbers from 11 - 20
        while(brake < 10 && testNumber <= limit){
            for(int i = 11; i<=20; i++){ //for each test number, we will check all the numbers from 11 to 20 to see if they divide evenly
                if(testNumber % i == 0){
                    brake+=1; //if all numbers from 11-20 divide test number evenly, brake value will hit 20 and stop the while loop
                }
            }
            testNumber += 9699690; //increment test number by itself, will run until it hits limit
            brake = 0; //resets brake at end of every failed loop
        }

        System.out.println(testNumber);
        for(int i = 2; i<21; i++){
            System.out.println(testNumber + " divided by " + i + " is " + testNumber/i);
        }
    }
}
