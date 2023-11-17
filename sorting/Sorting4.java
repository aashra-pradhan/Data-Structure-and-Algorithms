// 4. Write a Java program to sort an array of given integers using the Merge Sort Algorithm.

class Sorting4{
    static void mergesort(int[] a, int l, int r){
        if(l<r){
            double mm=Math.floor((l+r)/2); //because floor function ko output is in 'double' datatype
            int m=(int)mm; //explicit typecasting
            mergesort(a,l,m);
            mergesort(a,m+1,r);
            merge(a,l,m,r);
        }
    }

    static void merge(int[] a, int l, int m, int r){
        int[] b=new int[a.length];

        int x=l;
        int y=m+1;
        int k=l;

        while(x<=m && y<=r){
            if(a[x]<a[y]){
                b[k]=a[x];
                k++;
                x++;
            }
            else{
                b[k]=a[y];
                k++;
                y++;
            }
        }

        while(x<=m){
            b[k]=a[x];
            x++;
            k++;
        }
        while(y<=r){
            b[k]=a[y];
            k++;
            y++;
        }
        for(int i=l; i<=r; i++){
            a[i]=b[i];
        }
    }

    static void traverse(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr={18,96,35,85,27,0};
		mergesort(arr,0,5);
		traverse(arr);
    }
}