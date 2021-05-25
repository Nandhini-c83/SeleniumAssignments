package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class Duplicates {
	
	public void duplicateNumbers()
	{
		int [] arr = {1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7};
		Set<Integer> listValues = new TreeSet<Integer>();
		for (int i=0; i < arr.length; i++) 
		{
			if (listValues.add(arr[i]))
			{
				}
			else
				{
				System.out.println(arr[i]);
		}
		}
	}
	
public static void main(String[] args) {
	Duplicates dup = new Duplicates();
	dup.duplicateNumbers();
	}
		}