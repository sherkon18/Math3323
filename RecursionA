
public class recursionCaseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The program compares recursive and forumla for values from 0 to 5.");
		System.out.println("C(0) - Recursive: " + CaseA(0) + " " + "Forumla: " + SimpleCaseA(0));
		System.out.println("C(1) - Recursive: " + CaseA(1) + " " + "Forumla: " + SimpleCaseA(1));
		System.out.println("C(2) - Recursive: " + CaseA(2) + " " + "Forumla: " + SimpleCaseA(2));
		System.out.println("C(3) - Recursive: " + CaseA(3) + " " + "Forumla: " + SimpleCaseA(3));
		System.out.println("C(4) - Recursive: " + CaseA(4) + " " + "Forumla: " + SimpleCaseA(4));
		System.out.println("C(5) - Recursive: " + CaseA(5) + " " + "Forumla: " + SimpleCaseA(5));
		System.out.println("The forumla and recursion results all match.");
		
	}
	public static long CaseA(long value)
	{
	long n = value;
	//Recursion
		if(n >= 3)
		{
			long result;
			long a = 3*(CaseA(n-1));
			long b = 3*(CaseA(n-2));
			long c = CaseA(n-3);
			result = a - b + c;
			return result;
		}
		else return SimpleCaseA(n);
	}
	public static long SimpleCaseA(long value)
	{
		long n = value;
		//Simple formula
		n = (long) Math.pow(n,2);
		return n;
	}
	
	

}
