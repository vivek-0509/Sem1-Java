import java.util.*;
class functionrot{
static void function1(int[]M ,int k ){
   
    for(int a=0;a<k%M.length;a++){
      int m=M[0];
      for(int s=1;s<M.length;s++){
        
        M[s-1]=M[s];
      }
      M[M.length-1]=m;
    }
      
    // for(int s=0;s<M.length;s++){
        
    //     System.out.print(M[s]+",");
        
    //   }
     
    }

   
    public static void main(String [] args){
      
     Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      int M[]=new int[N];
        
    for(int s=0;s<M.length;s++){
        
        M[s]=sc.nextInt();
        
      }
      int k=sc.nextInt();
      function1(M,k);
      for(int s=0 ;s<M.length;s++){
        
        System.out.print(M[s]);
      }
     
    }
} 