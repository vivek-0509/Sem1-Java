import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int [] A=new int [N];
        for(int i=0;i<N;i++){
            A [i]=sc.nextInt();
        }
      
        // for(int i=0;i<N;i++){
        //     System.out.print(A);
        // }
        int min=A[0];
   for(int i=0;i<A.length;i++){
    if(A[i]<min){
        A[i]=min;
        min=A[i];
    }
   }

   for(int s=0 ;s<A.length;s++){
        
    System.out.print(A[s]);
  }
        
    }
}