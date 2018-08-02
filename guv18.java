import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num,rem,limit=1000, sum = 0;
		System.out.print("Armstrong numbers from 1 to N:");
		for (int i = 1; i <= limit; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.print(i + " ");
			}
			sum = 0;
		}

	}

}
