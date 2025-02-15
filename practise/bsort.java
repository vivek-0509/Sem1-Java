import java.util.*;
class bsort{
    static void sort(int []A){
      for(int i =1;i<A.length;i++){
        for(int j=i;j>0;j--){
            if(A[j-1]>A[j]){
                int temp =A[j-1];
                A[j-1]=A[j];
                A[j]=temp;
            }
        }
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