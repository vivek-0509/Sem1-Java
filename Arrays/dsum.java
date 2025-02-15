import java.util.*;
public class dsum{
     static void arrange(int A[][],int B[][]){
       int N=A.length;
       int M=A[0].length;
        int Sum[][]=new int [N][M];

        for(int i =0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
            Sum[i][j]=A[i][j]+B[i][j];
            }
           
           }
        
     }
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int Sum[][]=new int [N][M];
       int A [] []=new int[N] [M];
         for(int i =0;i<N;i++){
        for(int j=0;j<M;j++){
            A[i] [j]=sc.nextInt();
        }
       }

       int B [] []=new int[N] [M];
       for(int i =0;i<N;i++){
      for(int j=0;j<M;j++){
          B[i] [j]=sc.nextInt();
      }
     }
     arrange(A,B);
     for(int i =0;i<A.length;i++){
        for(int j=0;j<A[0].length;j++){
        System.out.print(Sum[i][j]);
        }
       
       }
    
     }
     
}
