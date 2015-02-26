//Special Pythagorean triplet
/*	solving the system of equations: a^2 + b^2 = c^2, and a + b + c = 1000 manually, we obtain:
	a = (1000)(b-500)/(b-1000), and c = (1000-b-a). 
	For the first equation, since a must be positive, we know that both the numerator and denominator
	of the fraction must be negative, since b < 1000. Thus, b must be less than 500. As long as we solve
	the first equation so that a is an integer, we can easily find the integer answer for c.*/

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashSet;
public class Euler8 
{
	public static void main(String[] args) 
	{
		int a=0,b=0,c=0;
		for (b= 1; b < 500; b++)
		{
			a = 1000 * (b-500)/(b-1000);
			if (a * (b-1000) + 500000 == 1000*b) //check if a is an integer
				break;
		}
		c = 1000 - a - b;
		System.out.println("A is: " + a + "\nB is: "+ b + "\nC is " + c);
		System.out.println("The product is: " + a*b*c);
	}
	
	
}
