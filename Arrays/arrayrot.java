import java.util.*;
class arrayrot{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int N=sc.nextInt();
      int[] M= new int [N];

      for(int i=0; i<M.length;i++){
        M[i]=sc.nextInt();
      }
      
   
      int m=M[0];
      for(int s=1;s<M.length;s++){
        
        M[s-1]=M[s];
      }
      M[M.length-1]=m;
     
      for(int s=0;s<M.length;s++){
        
        System.out.print(M[s]+",");
        
      }
    
     
    }
}