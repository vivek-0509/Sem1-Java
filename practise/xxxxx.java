import java.util.*;
public class multiply {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int [N][M];
        int B[][]=new int [N][M];
        int C[][]=new int [N][M];
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                A[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                B[i][j]=sc.nextInt();
            }
        }


        for(int i =0;i<N;i++){  
            for(int j=0;j<M;j++){
                C[i][j]=0;

                for(int k=0;k<M;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][i]; 
                }
               
            }
        }

        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
               System.out.print(C[i][j]);
            }
            System.out.println();
        }


    }
}
