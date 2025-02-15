import java.util.*;

public class arraycopy{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] S= new int[10];
       int [] M= new int[N];
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
    
    for(int i=0;i<M.length;i++){
        S[i]=M[N-1-i];
    }
     
      for(int i=0;i<10;i++) {
        System.out.print(S[i]+" ");
      }
   }



}