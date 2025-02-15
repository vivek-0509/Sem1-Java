import java.util.*;
public class lastclass{
    static ArrayList<Integer> getDia(int A[][],int i ,int j){
        ArrayList<Integer> dia=new ArrayList<>();
        while(i<A.length && j<A[0].length){
            dia.add(A[i][j]);
            i++;
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
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int[N][M];
        ArrayList<Integer> K=new   ArrayList<Integer>();
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
               A[i][j]=sc.nextInt();
            }
        }

     ArrayList<ArrayList<Integer>> diagonals = allDiagonals(A);
     for(int i=0;i<diagonals.size();i++){
        for(int j=0;j<diagonals.get(i).size();j++){
            K.add(diagonals.get(i).get(j));
        }
     }

     for(int i=0;i<K.size();i++){
        
      System.out.print(K.get(i)+" ");
        
     }
    }
}
