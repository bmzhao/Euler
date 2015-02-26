//sum of all multiples of 3 or 5 below 1000

//O(1) implemenatation
public class Euler1
{
	public static void main(String[] args)
	{
		final int BOUNDARY = 1000;
		int n = sumUpTo(5,BOUNDARY);
		int m = sumUpTo(10,BOUNDARY);
		int o = sumUpTo(15,BOUNDARY);
		int answer = n+m-o;
		System.out.println("The answer is: " + answer);

	}
	//calculate sum of all multiples of k up to, but not including max
	public static int sumUpTo(int k, int max)
	{
		int newMax = upperBound(k,max);
		return (newMax*newMax + newMax*k)/(2*k); //closed form solution of sum of all multiples of k less than max
	}
	//subroutine that returns the highest multiple of k that is less than max
	public static int upperBound(int k, int max)
	{
		if (max%k==0)
			return max-k;
		else
			return (max/k) * k;
	}


}

/*
//O(n) implementation
public class Euler1
{
	public static void main(String[] args)
	{
		final int BOUNDARY = 1000;
		int sum = 0;
		for (int i = 3; i < BOUNDARY; i +=3)
			sum +=i;
		for (int i = 5; i < BOUNDARY; i+=5)
			sum +=i;
		for (int i = 15; i < BOUNDARY; i+=15)
			sum -=i;
		System.out.println("The answer is: " + sum);
	}
		
}
*/