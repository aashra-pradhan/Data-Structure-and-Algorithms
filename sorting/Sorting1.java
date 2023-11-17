/ 1. Write a Java program to sort an array of given integers using the Bubble Sorting Algorithm.

class Sorting1{
	
	static void  Bubblesort(int[] arr)
	{
		int temp;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	static void traverse(int[] arr){
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={46,76,23,98,33};
		
		Bubblesort(arr);
		traverse(arr);
	}
}
                                                                                                                                                                                                                                                                                            
