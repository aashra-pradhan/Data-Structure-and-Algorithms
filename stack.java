class stack
{
	static int max=5;
	static int[] stack=new int[max];
	//array lai ni static banaune ho

	/*static function(psvm) can only call static functions, can have static or non static variables,
	 static variables lai object nabanayi just classname use garera call garna milyo whereas nonstatic 
	 ko lai object nai banaunuparcha, yo static ko kura haru bujhna please check gallery ko folder, tyo heryau bhane
	  majale bujhchau*/
	static int top=-1;
	
	static void push(int el)
	{
		// top ra max ta static variables so can easiky accesss them, without creating instances and change their values.
		if(top==max-1)
		{
			System.out.println("Stack overflow");
		}
		else{
			top++;
			stack[top]=el;
		}
	}
	
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack doesn't have anything");
		}
		else{
			System.out.println("The element being popped is "+ stack[top]);
			top--;
		}
	}
	
	static void traverse()
	{
		int temp=top;
		//yo temp ta yo function lai matra chahine variable ho, program bhari esko value ta same hune haina, so eslai static nabanako
		if(temp==-1)
		{
			System.out.println("Stack doesn't have anything");
		}
		else{
			while(temp!=-1)
			{
				System.out.println(stack[temp]);
				temp--;
			}
		}
	}
	
	static void search(int el)
	{
		int temp=top;
		int flag=0;
		if(temp==-1){
			System.out.println("Stack doesn't have anything");
		}
		while(temp!=-1)
		{
			if(stack[temp]==el)
			{
				System.out.println("Element=" + el + " is found in " + (temp+1) + "th location of stack.");
				flag++;
				break;
			}
		}
		if(flag==0){
			System.out.println("Element not  found");
		}
	}
	
	public static void main(String[] args)
	{
		push(5);
		push(6);
		push(7);
		push(8);
		push(9);
		System.out.println("After push operation:");
		traverse();
		System.out.println("\n");
		pop();
		System.out.println("After pop operation:");
		traverse();
		System.out.println("\n");
		search(8);
	}
}
		

					