//recursively find fibonacci series of any nth number(term)

import java.util.*;

class Recursion4
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth term:\n");
        int n =scan.nextInt();

        int i=0;

        do{
            System.out.println(fibo(i) + " ");
            i++;
        }while(fibo(i)<=n);

    }

    static int fibo(int n)
    {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return(fibo(n-1)+fibo(n-2));
        }
    }
}