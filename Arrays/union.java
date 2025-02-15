import java.util.*;

public class union{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int [] A= new int[N];
       int [] B=new int[M];
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
       
       for(int i=0;i<B.length;i++){
        B[i]=sc.nextInt();
       }

       int union []=new int[M+N];
       for(int i=0;i<A.length;i++){
        for(int j=0;j<B.length;j++){
            if(A[i]!=B[j]){
                if(A[i]>B[j]){
                    System.out.print(A[i]);
                }
            }
        }
       }
      
    }
}

