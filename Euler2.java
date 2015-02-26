//even fibonacci numbers
//O(n) implementation
public class Euler2
{
	public static void main(String[] args)
	{
		long BOUNDARY = 4000000;
		long sum = 0;
		long previous2 = 1;
		long previous1 = 2;
		long current = 3;
		while (previous2 <= BOUNDARY)
		{
			if (previous2%2==0)
				sum+=previous2;
			previous2=previous1;
			previous1=current;
			current=previous1+previous2;
		}
		System.out.println("The answer is : " + sum);
	}
}
