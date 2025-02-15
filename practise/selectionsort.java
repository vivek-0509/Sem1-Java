import java.util.*;
class selectionsort{
    static void sort(int []A){
      for(int i =0;i<A.length;i++){
        int min=i;
        for(int j=i+1;j<A.length;j++){
            if(A[min]>A[j]){
                min=j;
            }
        }
        int temp=A[min];
        A[min]=A[i];
        A[i]=temp;
      }
    }
    public static void main(String [] args){
      Scanner sc=new Scanner (System.in);
       int N=sc.nextInt();
       int A[]=new int [N];

       for(int j=0;j<A.length;j++){
        A[j]=sc.nextInt();
    }
    sort(A);


    for(int j=0;j<A.length;j++){
        System.out.print(A[j]);
    }

    }
}