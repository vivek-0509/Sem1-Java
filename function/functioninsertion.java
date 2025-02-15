import java.util.*;
public class functioninsertion {
     static void sort(int A[]){
        for(int i =0;i<A.length;i++){
         int  min=A[i];
         for(int j=0;j<i+1;j++){
           if(A[i]<A[j]){
            int temp=A[j];
            A[j]=A[i];
            A[i]=temp;
           }
         }
     }
    }
  public static void main(String [] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int A[]=new int[N];
    for(int i =0;i<A.length;i++){
        A[i]=sc.nextInt();
    }
    sort(A);
    for(int i =0;i<A.length;i++){
        System.out.print(A[i]);
    }
    }
  }

