import java.util.*;
public class dia{
    static ArrayList<Integer> getDia(int A[][],int i ,int j){
        ArrayList<Integer> dia=new ArrayList<>();
        while(i>=0 && j<A[0].length){
            dia.add(A[i][j]);
            i--;
            j++;
        }
        return dia;
    }

    static ArrayList<ArrayList<Integer>> allDiagonals(int A[][]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int j=A[0].length-1;j>=0;j--){
            ans.add(getDia(A,0,j));
        }

        for(int i=1;i<A.length;i++){
            ans.add(getDia(A,i,0));
        }
        return ans;

    }
    public static void main(String[]args){
       Scanner sc=new Scanner (System.in);
       int N=sc.nextInt();
       int M=sc.nextInt();
       int A[][]=new int[N][M];
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
              A[i][j]=sc.nextInt();
            }
        }

        ArrayList<ArrayList<Integer>> result=allDiagonals(A);

        for(int j =0;j<result.size();j++){
           System.out.print(result.get(j));
          }
    }
}
