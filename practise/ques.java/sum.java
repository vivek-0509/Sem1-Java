import java.util.*;
public class sum{
    static int sum(int A[][],int i,int j){
        ArrayList<Integer> dia=new  ArrayList<Integer>();
        while(i<A.length && j<A[0].length){
            dia.add(A[i][j]);
            i++;
            j++;
        }
       int sum=0;
        for(int k=0;k<dia.size();k++){
           sum=sum+dia.get(k);
        }
        return sum;
    }
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A [][] =new int [N][M];
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
              A[i][j]=sc.nextInt();
            }
        }
        int a=0;
        int B[]=new int[N+M-1];
        for(int i=A.length-1;i>=0;i--){
           B[a]=sum(A,i,0);
           a++;
        }
        for(int i=1;i<=M-1;i++){
            B[a]=sum(A,0,i);
            a++;
         }

         for(int i=0;i<B.length;i++){
         System.out.print(B[i]+" ");
            
         }
        }
}

