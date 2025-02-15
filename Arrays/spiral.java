import java.util.*;
public class spiral {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int A[][]=new int [N][N];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int X=0;
        if(N%2==0){
            X=N/2;
        }
        else{
           X=(N/2)+1;
        }
        

        for(int i =0;i<X;i++){
            for(int j =i;j<A[0].length-i;j++){
               ans.add(A[i][j]);
            }

            for(int j=i+1;j<A.length-i;j++){
              ans.add(A[j][N-1-i]);
            }

            for(int j =A[0].length-2-i;j>=i+0 ;j--){
               ans.add(A[N-1-i][j]);
            }

            for(int j=A.length-2-i;j>i;j--){
                ans.add(A[j][0+i]);
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}

