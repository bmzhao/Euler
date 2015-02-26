//10001st prime
//inefficient implementation, O(n^(3/2)) running time
public class Euler7
{
	public static void main(String[] args) 
	{
		int BOUNDARY = 10001;
		int primeCounter=0;
		long counter = 2;
		while (primeCounter!=BOUNDARY)
		{
			if (isPrime(counter))
			{
				primeCounter++;
			}
			counter++;
				
		}
		System.out.println("The answer is : " + --counter);
	}

	public static boolean isPrime(long a)
	{
		for (long i = 2; i <= (int)Math.sqrt(a); i++)
			if (a%i==0)
				return false;
		return true;
	}
	
	
}
