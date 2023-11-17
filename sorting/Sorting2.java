// 2. Write a Java program to sort an array of given integers using the Insertion sort algorithm.

class Sorting2{
	
	static void  Insertionsort(int[] arr)
	{
		int key;
		int j;
		
		for(int i=1; i<arr.length; i++)
		{
			key=arr[i];
			j=i-1;
			
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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
		
		Insertionsort(arr);
		traverse(arr);
	}
}
                                                                                                                                                                                                                                                                                            
