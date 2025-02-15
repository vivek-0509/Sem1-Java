import java.util.*;
public class cp2{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int T=sc.nextInt();
        for(int a=0;a<T;a++){
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int [N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
              A[i][j]=sc.nextInt();
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int left=0;
        int right=M-1;
        int top=0;
        int bottom=N-1;

        while(top<=bottom && left<=right){
            for(int i =left;i<=right;i++){
                ans.add(A[top][i]);
            }
            top++;

            for(int i =top;i<=bottom;i++){
                ans.add(A[i][right]);
            }
            right--;
            if(top<=bottom){
           
            for(int i =right;i>=left;i--){
                ans.add(A[bottom][i]);
            }
            bottom--;
        }

          if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans.add(A[i][left]);
            }
            left++;
        }
        }
         
        int c=0;
        for(int i=0;i<ans.size()-3;i++){
           if(ans.get(i)==1){
            if(ans.get(i+1)==5){
                if(ans.get(i+2)==4){
                    if(ans.get(i+3)==3){
                        c++;
                    }
                }
            }
           }

        }
        System.out.println(c);
        }

    }
}