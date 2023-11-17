//Recursive program to calculate GCD of two numbers using recursive function

import java.util.*;
class Recursion1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int gcd=GCD(x,y);
		System.out.println("The gcd ="+ gcd);
	}
	
	static int GCD(int x,int y)
	{
		if(y!=0)
		{
			return GCD(y,x%y);
		}
		else{
			return x;
		}
	}
}