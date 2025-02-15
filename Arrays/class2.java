import java.util.*;
public class class2{
    static void sort(int A[][]){
        int N=A.length;
        int M=A[0].length;
      for(int i =0;i<N;i++){
        for(int j=i+1;j<M;j++){
            int temp=A[i][j];
            A[i][j]=A[j][i];
            A[j][i]=temp;
                    }
      }
    }
   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int A[][]=new int[N][M];
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A.length;j++){
            A[i][j]=sc.nextInt();
        }
       
    }
     
    sort(A);
    for(int i =0;i<N;i++){
        for(int j=0;j<M;j++){
            System.out.print(A[i][j]);
        }
        System.out.println();
      }
    
   }
}
