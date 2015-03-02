//Name: Dalibor Labudovic
//Course: Math 3323
//Assignment 2
public class RecursionH {

	public static void main(String[] args) 
	{
		for(int i = 0; i <= 10; i++)
		{
		System.out.println(h(i));
		}
	}
	public static long h(long value)
	{
		if(value > 1)
		{
			long n;
			n = (value-1)*(h(value-1)+ h(value-2)); 
			return n;
		}
		else
		{
			return simpleH(value);
		}
	}
	public static long simpleH(long value)
	{
		
		return value = (long) Math.pow((value - 1),2);
	}

}
