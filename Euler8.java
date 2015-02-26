//Largest product in a series
/*	pretty good implementation; only has to compute product of 263 sets of consecutive integers,
	instead of 987 (which is brute force)
	The trick is to not count any integer whose index is  BOUNDARY locations less than a 0. This scales 
	well since larger BOUNDARY typically means more work (in terms of multiplications), but
	it is offest by the reduced set of possible consecutive integers needed to multiply, since 
	anything within BOUNDARY less of a 0 can be skipped*/

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashSet;
public class Euler8 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> hugeNumber = load(new File("LargestProductInASeries.txt"));
		if (hugeNumber !=null)
		{
			final int BOUNDARY = 13;
			HashSet<Integer> indexes = zeroIndexes(hugeNumber,BOUNDARY);
			long answer = 0;
			for (int i = 0; i <= hugeNumber.size()-BOUNDARY; i++)
			{
				if (indexes.contains(i))
					continue;
				else
				{
					long temp = 1;
					for (int j = i; j < BOUNDARY+i; j++)
					{
						temp*=hugeNumber.get(j);
					}
					if (temp > answer)
						answer = temp;
				}
			}
			System.out.println("The answer is " + answer);
		}
	}

	public static ArrayList<Integer> load(File f) 
	{
		ArrayList<Integer> answer = new ArrayList<Integer>();
		try
		{
			Scanner read = new Scanner(f);
			while (read.hasNextLine())
			{
				String current = read.nextLine();
				for (int i = 0; i < current.length(); i++)
				{
					answer.add(Integer.parseInt(current.charAt(i) + ""));
				}
			}
			return answer;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("No file found");
			return null;
		}


	}
	
	public static HashSet<Integer> zeroIndexes(ArrayList<Integer> a, int bound)
	{
		HashSet<Integer> answer = new HashSet<Integer>();
		for (int i = 0; i < a.size(); i++)
		{
			if (a.get(i)==0)
			{
				int lower = lowerBound(i, bound);
				int upper = i;
				for (int j = lower; j <=upper; j++)
					answer.add(j);
			}
		}
		return answer;
	}

	public static int lowerBound(int index, int bound)
	{
		if (index-bound+1<0)
			return 0;
		else 
			return index-bound+1;
	}
	
}
