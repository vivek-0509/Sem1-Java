import java.util.*;
public class modify {
     static void arrange(int A[][]){
        
        for(int i =0;i<A.length;i++){
            int s=0;
            for(int j=0;s<=A[0].length-1 && j<A[0].length;j++){
                int temp=A[i][j];
              A[i][j]=A[i][A[0].length-1-s];
              A[i][A[0].length-1-s]=temp;

              s++;
            }
            
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

    // for(int i =0;i<A.length;i++){
    //     for(int j=A[0].length-1;j>=0;j--){
    //       System.out.print(A[i][j]);
    //     }
    //     System.out.println("");
    //    }
    for(int i = 0 ; i<A.length ; i++){
        for (int j = 0 ; j < A[0].length ; j++){
            System.out.print(A[i][j]);
        }
        System.out.println();
    }
    
     }
     
}
