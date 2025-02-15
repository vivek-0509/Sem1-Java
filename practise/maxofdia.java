import java.util.*;
public class maxofdia{
  static  ArrayList <Integer> diaAll (int A[][],int i ,int j){
        ArrayList<Integer> dia=new ArrayList<Integer>();
        while(i<A.length && j<A[0].length){
            dia.add(A[i][j]);
            i++;
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
        int k=sc.nextInt();
        // int l=sc.nextInt(); 
      
        ArrayList<Integer> dady=diaAll(A,k,0);
      int max=0;
        for(int i=0;i<dady.size();i++){
            if(max<dady.get(i)){
                max=i;

            }
        }
        A[k+max][0+max]=50;
      
        for(int i =0;i<N;i++){
            for(int j=0;j<M;j++){
              System.out.print(A[i][j]);
            }
            System.out.println();
        }

    }
}


