// 3. Write a Java program to sort an array of given integers using the Quick sort algorithm.

class Sorting3{
	
	static void  quick(int[] arr, int l, int r)
	{
		if(l<r){
			int k=partition(arr,l,r);
			quick(arr,l,k-1);
			quick(arr,k+1,r);
		}
	}
	
	static int partition(int[] arr, int l, int r)
	{
		int pivot=arr[l];
		int x=l;
		int y=r;
	
		while(x<y)
		{
			while(arr[x]<=pivot)
			{
				x++;
			}
			while(arr[y]>pivot)
			{
				y--;
			}
			if(x<y)
			{
				swap(arr[x],arr[y]);
			}
		}
		swap(arr[y], pivot);
		return y;
	}
	
	static void swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	static void traverse(int[] arr){
		for(int i=0; i<arr.length;i++)
		{ 
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={18,996,35,855,27,0};
		quick(arr,0,5);
		traverse(arr);
	}
}
                                                                                                                                                                                                                                                                                            
