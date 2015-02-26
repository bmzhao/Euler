//largest prime factor of a number
public class Euler3
{
	public static void main(String[] args) throws Exception
	{
		long key = 600851475143L;
		if (key < 2)
			throw new Exception("bad key");
		long answer = 2;
		for (long i = 2; i <= key; i++)
		{
			if (key%i ==0 && isPrime(i))
			{
				if (i > answer)
					answer = i;
				key = key/i;
				i = 2;
			}
				
		}
		System.out.println(answer);
	}

	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return true;
		else
		{
			for (long i = 2; i < a; i++)
			{
				if (a%i == 0)
					return false;
			}
			return true;
		}
	}
}
