import java.util.*;

public class insertionsort{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] A= new int[N];
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
       
       for(int i=0;i<=A.length-2;i++){
         
         for(int j=i;j<=A.length-1;j++){
            if(A[j-1]>A[j]){
               int temp= A[j-1];
                A[j-1]=A[j];
                A[j]=temp;
         }
                
            A[i]=min;
        }
        // int temp=min;
        // min=A[i];
        // A[i]=temp;

       }
       for(int i=0;i<A.length;i++){
        System.out.print(A[i]);
       }
       
    }
}
