import java.util.*;
class function3{
static void arrange(int[]A){
   int a=A[A.length-1];
   
   for(int s=A.length-2;s>0;s--){
       if(a<A[s]){
        A[s]=a;
        -+
       }
   }
   
    }

    public static void main(String [] args){
      
     Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      int A[]=new int[N];
    
      for(int s=0;s<A.length;s++){
        
        A[s]=sc.nextInt();
        
      }
     
      arrange(A);
      for(int s=0 ;s<A.length;s++){
        
        System.out.print(A[s]);
      }
 
     
    }
} 





