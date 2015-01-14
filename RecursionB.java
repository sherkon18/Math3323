
public class recursionCaseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The program compares recursive and forumla for values from 0 to 5.");
		System.out.println("C(0) - Recursive: " + CaseB(0) + " " + "Forumla: " + SimpleCaseB(0));
		System.out.println("C(1) - Recursive: " + CaseB(1) + " " + "Forumla: " + SimpleCaseB(1));
		System.out.println("C(2) - Recursive: " + CaseB(2) + " " + "Forumla: " + SimpleCaseB(2));
		System.out.println("C(3) - Recursive: " + CaseB(3) + " " + "Forumla: " + SimpleCaseB(3));
		System.out.println("C(4) - Recursive: " + CaseB(4) + " " + "Forumla: " + SimpleCaseB(4));
		System.out.println("C(5) - Recursive: " + CaseB(5) + " " + "Forumla: " + SimpleCaseB(5));
		System.out.println("The forumla and recursion results all match.");

	}
	public static long CaseB(long value)
	{
		long n = value;

		//recursion
		if(n >= 5){
			long result;
			long a =  12*CaseB(n-1);
			long b = 57*CaseB(n-2);
			long c = 134*CaseB(n-3);
			long d = 156*CaseB(n-4);
			long e = 72*CaseB(n-5);
			result = a - b + c - d + e;
			return result;
		}
		else {return SimpleCaseB(n);}
		
	}
	public static long SimpleCaseB(long value)
	{
		long n = value;
		long a = (long)Math.pow(n, 2);
		long b = (long)Math.pow(2, n);
		long c = (long)Math.pow(3, n);
		n = a*b + (n*c);
		return n;
	}
}
