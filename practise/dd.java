import java.util.*;
public class dd{
  public  static   int [][]multiply(int A[][],int B[][]){
        int N=A.length;
        int R=A[0].length;
        int M=B[0].length;
        int C[][]=new int [N][M];
        for(int i =0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
            int sum=0;
             for(int k=0;k<A[0].length;k++){
                sum=sum+A[i][k]*B[k][j];
             }
             C[i][j]=sum;
            }
           
        }
        return C;

    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        int M=sc.nextInt();
       
        int A[][]=new int [N][R];
        int B[][]=new int [R][M];
        int C[][]=new int [N][M];
        for(int i =0;i<N;i++){
            for(int j=0;j<R;j++){
                A[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<R;i++){
            for(int j=0;j<M;j++){
                B[i][j]=sc.nextInt();
            }
        }
       C =  multiply(A,B);
       
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
               System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }


    }
}

