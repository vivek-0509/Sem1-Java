import java.util.*;

public class arrayrotr{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] M= new int[N];
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
    int x=M[M.length-1];
       for(int s=M.length-1;s>0;s--){
         M[s]=M[s-1];
       } 
       M[0]=x;
       for(int s=0;s<M.length;s++){
        System.out.print(M[s]+",");
       }
       
   }



}