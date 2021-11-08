

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Multiplicacions per potència:

/*  Fes un programa que llegeixi: - el valor de la base: un nombre enter - el valor de l’exponent: unnombre enter no negatiu

S'ha d'efectuar l'operació de la potència ab. NO es pot usar la funció Math.pow().

Input Format

base: nombre enter

exponent: nombre enter no negatiu

Constraints

no n'hi ha.

Output Format

s'imprimeix la solució de l'operació ab

Sample Input 0

2 4
Sample Output 0

16
Sample Input 1

5 0
Sample Output 1

1

 */


public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int expo = sc.nextInt();
        int var = num;

        if (expo == 0 ) {System.out.println(1);}
        else{
            while (expo > 1)
            {
                var = var * num;
                expo--;
            }
            System.out.println(var);
        }


    }
}
