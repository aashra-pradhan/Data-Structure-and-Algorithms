//Recursive program to find factorial of any one number

import java.util.*;
class Recursion3
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1 number:");
		int x=scan.nextInt();
		int f=fact(x);
		System.out.println("The factorial is="+ f);
	}
	
	static int fact(int x)
	{
		if(x==0 || x==1)
		{
			return 1; 
		}
		else{
			return (x * fact(x-1));
		}
	}
}