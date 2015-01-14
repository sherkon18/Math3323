
public class recursionCaseC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The program compares recursive and forumla for values from 0 to 5.");
		System.out.println("C(0) - Recursive: " + CaseC(0) + " " + "Forumla: " + SimpleCaseC(0));
		System.out.println("C(1) - Recursive: " + CaseC(1) + " " + "Forumla: " + SimpleCaseC(1));
		System.out.println("C(2) - Recursive: " + CaseC(2) + " " + "Forumla: " + SimpleCaseC(2));
		System.out.println("C(3) - Recursive: " + CaseC(3) + " " + "Forumla: " + SimpleCaseC(3));
		System.out.println("C(4) - Recursive: " + CaseC(4) + " " + "Forumla: " + SimpleCaseC(4));
		System.out.println("C(5) - Recursive: " + CaseC(5) + " " + "Forumla: " + SimpleCaseC(5));
		System.out.println("The forumla and recursion results do not match.");

	}
	public static long SimpleCaseC(long value)
	{
		long n = value;
		long result;
		long a = 3*(long)Math.pow(n, 2);
		long b = (long)Math.pow(n,3);
		result = 12 + (8*n) - a + b;
		return result;
	}
	public static long CaseC(long value)
	{
		long n = value;
		if(n>=2)
		{
			long result;
			result = 2*CaseC(n-1) - CaseC(n-2);
			return result;
		}
		else return SimpleCaseC(n);
	}

}
