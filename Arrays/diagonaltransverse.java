import java.util.*;
public class diagonaltransverse{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int [N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
              A[i][j]=sc.nextInt();
            }
        }
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
      
        for(int i=0;i<(N+M-1)/2;i++){
            int a=0;
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=M-1-i;j>M-2;j--){
                 temp.add(A[M-1][a]);
                 a++;
            }
            ans.add(temp);
        }

        for(int i=0;i<(N+M-1)/2;i++){
            int a=0;
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=M-1;j>0;j--){
                 temp.add(A[M-1][a]);
                 a++;
            }
            ans.add(temp);
        }

    }
}