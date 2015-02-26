//smallest multiples of all numbers between 1 and 20
//bewteen OMEGA(nlogn) and O(n^2) implementation, where n is the range of numbers
public class Euler5
{
	public static void main(String[] args)
	{
		final int BOUNDARY = 20;
		int[] struc = new int[BOUNDARY+1];
		for (int i = 2; i <= BOUNDARY; i++)
		{
			update(struc, i);
			//print(struc);
			//System.out.println();
			
		}
		double answer = 1;
		for (int i = 2; i <=BOUNDARY; i++)
		{
			answer *= Math.pow(i*1.0,struc[i]*1.0);
		}
		System.out.println((int)answer);

	}
	
	public static void print(int[] a)
	{
		for(int i = 0; i < a.length;i++)
			System.out.print(a[i] + " ");
	}


	public static void update(int[] a, int b)
	{
		for (int i = 2; i <= b; i++)
		{
			int temp =0;
			
			while (b%i==0)
			{
				temp++;
				b = b/i;
			}
			if (a[i]< temp)
				a[i] = temp;
			
		}
	}	
}
