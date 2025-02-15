import java.util.*;
public class rotate{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int A[][]=new int [N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
              A[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<A.length;i++){
            int left=0;
            int right=A[0].length-1;
            while(left<=right){
                int temp=A[i][left];
                A[i][left]=A[i][right];
                A[i][right]=temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<A[0].length;i++){
            int top=0;
            int bottom=A[0].length-1;
            while(top<=bottom){
                int temp=A[top][i];
                A[top][i]=A[bottom][i];
                A[bottom][i]=temp;
                top++;
                bottom--;
            }
        }


        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
             System.out.print(A[i][j]);
            }
            System.out.println();
        }
    
    }
}
