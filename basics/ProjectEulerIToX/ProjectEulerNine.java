/*
A Pythagorean triplet is a set of three natural numbers, a < b < c,
for which a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.

Find the product a*b*c


a + b + c = 1000 and a^2 + b^2 = c^2

so c = sqrt(a^2 + b^2)

c can't be any less than 335 because then a or b would have to be greater than c, so a + b can't be any more than 666.
b can't be more than 333 and a can't be more than 332

1 < a < 333
for any a, we must pick b such that a < b < = 665 - a
and for any a + b we must pick c such that 1000 - (a + b) = c > = 334

*/

package basics.ProjectEulerIToX;

public class ProjectEulerNine {

    /*loop through all potential values for a, then test b and c for each one using parameters:
    1 < a < 333
    for any a, we must pick b such that a < b < = 665 - a
    and for any a + b we must pick c such that 1000 - (a + b) = c > = 334
    */  

    public static void main(String[] args){

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 1; i<333; i++){ //loop through all possible values of a
            a = i;
            for(int j = 1; j <= 665 - a; j++){ //loop through all possible values of b
                b = a + j;
                c = 1000 - a - b;
                if((a*a) + (b*b) == (c*c)){
                    System.out.println("Pythagorean triple of " + a + ", " + b + ", and " + c + " adds up to 1000");
                    System.out.println("Product is " + a*b*c);
                    break;
                }
            }
        }
        System.out.println("Program finished");
    }
    
}
