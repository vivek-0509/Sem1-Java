import java.util.*;
class array14{
    public static void main(String [] args){
     Scanner sc =new Scanner(System.in);
      int N=sc.nextInt();
      int[] M= new int [N];

      for(int i=0; i<M.length;i++){
        M[i]=sc.nextInt();
      }
      int k=sc.nextInt();
   
      for(int j=0;j<k;j++){
        M[N-k+j]=M[j];
      }

      for(int s=0;s<N-k;s++){
        
        M[s]=M[s+k];
      }
      
      
     
      for(int s=0;s<M.length;s++){
        
        System.out.print(M[s]+",");
        
      }
    
     
    }
}
