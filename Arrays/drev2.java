import java.util.*;
public class drev2 {
     static void arrange(int A[][]){
        for(int i =0;i<A.length;i++){
            for(int j=A[0].length-1;j>=0;j--){
               System.out.print(A[i][j]);
            }
            System.out.println("");
           }
     }
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int insert = 1 ;
       int A [] []=new int[N] [M];
         for(int i =0;i<N;i++){
        for(int j=0;j<M;j++){
            A[i] [j]=insert;
            insert++;
        }
       }
       arrange(A);
     }
     
}
