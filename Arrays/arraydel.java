import java.util.*;

public class arraydel{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       
       int [] M= new int[N];
       for(int i=0;i<M.length;i++){
        M[i]=sc.nextInt();
       }
    
    
       for(int s=2;s<M.length;s++){
         M[s-1]=M[s];
       } 
       
       for(int s=0;s<M.length-1;s++){
        System.out.print(M[s]+",");
       }
       
   }



}