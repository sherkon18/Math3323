//Name: Dalibor Labudovic
//Course: Math 3323
//Assignment 2

//From my analysis it looks as if for every n+1 argument, time to compute is almost doubled.
//I believe a more efficient method would be utilize a iteration method because the function can dynamically
//allocate or resize memory blocks. Automatic allocation is much faster; speed vs storage cost of recursion
//The smallest value for an argument to take at least 10 seconds to complete is argument value 33. 
//Argument value 33 actually takes 17.15 seconds to complete.

public class vbrf {

	public static void main(String[] args) 
	{
		for(int i = 0; i <= 12; i++)
		{
			long t0 = System.nanoTime();
			int x = (int) vbrf(i);
			long t1 = System.nanoTime();
			double timeInSeconds = (t1 - t0)*1.0e-9;
			System.out.println("Recursion value " + i + " equals "+ x +", and it took " + timeInSeconds + " seconds to compute.");
			
		}
		
	}
	public static long vbrf(long value)
	{
		long n = value;
		if(n > 0)
		{
			long result;
			result = vbrf(n-1) - vbrf(n-2) + 3*vbrf(n-3) - 2*vbrf(n-4);
			return result;
		}
		else return BeforeVBRF(n);
	}
	public static long BeforeVBRF(long value)
	{
		long n = value;
		n +=2;
		return n;
	}

}
