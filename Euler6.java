//sum square difference
//O(1) implementation
public class Euler6
{
	public static void main(String[] args) 
	{
		final int BOUNDARY = 100;
		int lowerSum = squareSum(BOUNDARY);
		int upperSum = (int)Math.pow(sum(BOUNDARY)*1.0,2.0);
		System.out.println("The answer is: " + (upperSum-lowerSum);

	}

	public static int squareSum(int n)
	{
		return  n*(n+1)*(2*n+1)/6;
	}
	public static int sum(int n)
	{
		return n * (n+1)/2;
	}
	
	
}
