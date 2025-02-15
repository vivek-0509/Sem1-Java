import java.util.*;

public class array7{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] M= new int[N];
       int [] S= new int[2*M.length];
     
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
    
    for(int i=0;i<M.length;i++){
        S[i]=M[i]; 
    }
      M=S;
      System.out.println(M.length);
      for(int i=0;i<10;i++) {
        System.out.print(M[i]+" ");
      }
   }



}
