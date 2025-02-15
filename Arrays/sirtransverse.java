import java.util.*;
public class sirtransverse{
     static ArrayList<Integer> getdiagonal (int A[][],int i,int j){
         ArrayList<Integer> dia=new ArrayList<>();
         while(i<A.length && j<A[0].length){
             dia.add(A[i][j]);
             i++;
             j++;
         }
         return dia;
    }

    static ArrayList<ArrayList<Integer>> getAllDia(int [][]A){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        for(int i =A.length-1;i>=0;i--){
            ans.add(getdiagonal(A,i,0));
        }

        for(int j=1;j<A[0].length;j++){
            ans.add(getdiagonal(A,0,j));
        }
        return ans;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[][]=new int[N][M];
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[0].length;j++){
               A[i][j]=sc.nextInt();
            }
        }

     ArrayList<ArrayList<Integer>> diagonals = getAllDia(A);
     for(int i=0;i<diagonals.size();i++){
        System.out.print(diagonals.get(i));
     }
    }
}