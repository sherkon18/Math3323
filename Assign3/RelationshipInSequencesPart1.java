
/* Name: Dalibor Labudovic
 * Prof: Ben Setzer
 * Class: Math3323
 * Assignment: Assignment 3 Part 1
 * 
 * Analysis:
 * a - f  = 0
 * b + f = 0
 * c = 0
 * d = 0
 * e + f = 0
 * We assume a = 1 f = 1, then we can say b = -1, c = 0, d = 0,e = -1
 * Candidate Relationship: (1)f(n) + (-1)f(n-1) + (0)f(n-2) + (0)f(n-3) + (-1)f(n-4) + f(n-5) = 0
 */
import math3323.sequence.Matrix;
import math3323.sequence.Sequence;
public class RelationshipInSequencesPart1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fillMatrix();
		CandidateRelationshipTest();
		
	}
	public static void fillMatrix()
	{
		Sequence seq = new Part1();
		
		Matrix m = Matrix.sequenceFill(10, 6, seq);
		
		System.out.println("Original Matrix:");
		System.out.println(m);
		System.out.println("Reduced Matrix:");
		m.reduceMatrixViaRational();
		System.out.println(m);		
	}
	public static void CandidateRelationshipTest()
	{
		//Candidate Relationship: (1)f(n) + (-1)f(n-1) + (0)f(n-2) + (0)f(n-3) + (-1)f(n-4) + f(n-5) = 0
		Part1 p = new Part1();
		
		for(int i = 5; i <=15; i++)
		{
			long a = (1)*p.get(i) + (-1)*p.get(i-1) + (0)*p.get(i-2) + (0)*p.get(i-3) + (-1)*p.get(i-4) + p.get(i-5);
			
			System.out.println("Relationship: " + a);
			
		}
	}
	private static class Part1 implements Sequence 
	{
		public long get(long n) 
		{
			return n/4;
		}
	}
	

}
