// 3. Write a Java program to sort an array of given integers using the Quick sort algorithm.

public class trysort3{
	
	static void  quick(int[] arr, int l, int r)
	{
		if(l<r){
	    			System.out.println("56");

			int k=partition(arr,l,r);
			System.out.println(k);

			quick(arr,l,k-1);
			quick(arr,k+1,r);
		}
	}
	
	
	static int partition(int[] arr, int l, int r)
	{
	   try{
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
                                   System.out.println("huahu");

			}
			 if(x<y)
			{
              
				swap(arr[x],arr[y]);
			}
		}
     
		swap(arr[y], pivot);
		return y;
	   }
	   catch(Exception e){
	       int a=20;
	       System.out.println("ERROR");
	       return a;
	   }
	   finally{
	       	       System.out.println("finally block");

	   }
	}
	
	static void swap(int x, int y)
	{
	   

		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	static void traverse(int[] arr){
	    			System.out.println("Aashra");

		for(int i=0; i<arr.length;i++)
		{ 
			System.out.println("Aashra");

			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={18,96,35,55,27,0};
					    			System.out.println("TS");

		quick(arr,0,5);
			    			System.out.println("Aashra");

		traverse(arr);
			    			System.out.println("PP");

	}
}
                                                                                                                                                                                                                                                                                            
