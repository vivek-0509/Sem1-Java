import java.util.*;
public class diagonal{
  static  ArrayList <Integer> diaAll (int A[][],int i ,int j){
        ArrayList<Integer> dia=new ArrayList<Integer>();
        while(i>=0 && j<A[0].length){
            dia.add(A[i][j]);
            i--;
            j++;
        }
        return dia;
    }
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int N=sc.nextInt();
       
        int M=sc.nextInt();
       
        int A[][]=new int [N][M];
      
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
                A[i][j]=sc.nextInt();
            }
        }
         
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> dady=new ArrayList<>();
        for(int i=0;i<=N-1;i++){
            ans.add(diaAll(A,i,0));
        }

        for(int i=1;i<A[0].length;i++){
            ans.add(diaAll(A,N-1,i));
        }
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
               dady.add(ans.get(i).get(j));
            }
        }

        for(int i =0;i<dady.size();i++){
            System.out.print(dady.get(i)+" ");
        }

    }
}


