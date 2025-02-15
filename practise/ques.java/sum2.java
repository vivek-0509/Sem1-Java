import java.util.*;
public class sum2{
    static ArrayList<Integer> sum(int A[][],int i,int j){
        ArrayList<Integer> dia=new  ArrayList<Integer>();
        while(i>=0 && j<A[0].length){
            dia.add(A[i][j]);
            i--;
            j++;
        }
    //    int sum=0;
    //     for(int k=0;k<dia.size();k++){
    //        sum=sum+dia.get(k);
    //     }
        return dia;
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
        // int B[]=new int[N+M-1];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        // for(int i=0;i<=N-1;i++){
        //    ans.add(sum(A,i,0));
        //    a++;
        // }
        // for(int i=1;i<=M-1;i++){
        //     ans.add(sum(A,A.length-1,i));
        //     a++;
        //  }

        for(int i=M-1;i>=0;i--){
            ans.add(sum(A,A.length-1,i));
            a++;
         }
         for(int i=N-2;i>=0;i--){
             ans.add(sum(A,i,0));
             a++;
          }

         for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
         }
            
         
        
        }
}

