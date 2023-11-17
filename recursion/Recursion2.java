//Recursive program to solve TOH for n number of disks

import java.util.*;
class Recursion2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter NO.OF DISKS:\n");
		int n=scan.nextInt();
		TOH(n, 'A','B','C');
	}
	
	static void TOH(int n, char A, char B, char C)
	{
		if(n<0)
		{
			System.out.println("Invalid entry");
		}
		else if(n==1)
		{
			System.out.println("Move disc from"+A+" to "+B);
		}
		else{
			TOH(n-1,A,C,B);
			TOH(1,A,B,C);
			TOH(n-1,C,B,A);
		}
	}
}