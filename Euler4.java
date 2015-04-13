//largest palindrome from product of 2 3-digit numbers
//O(n^2) implementation
public class Euler4
{
	public static void main(String[] args)
	{
		System.out.println("hello world"); //hello
		int answer = 0;
		for (int i = 999; i >=100; i--)
		{
			for (int j = i; j >=100; j--)
			{
				if (isPalindrome(i*j))
					if (i*j>answer)
						answer=i*j;
			}
		}
		System.out.println(answer);
	}


	public static boolean isPalindrome(Integer n)
	{
		String x = n.toString();
		int size = x.length();
		for (int i = 0; i < size/2; i++)
		{
			if (x.charAt(i) != x.charAt(size-1-i))
				return false;
		}
		return true;
	}
}
