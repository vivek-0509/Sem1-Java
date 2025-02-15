import java.util.*;
class function2{
static void minx(int[]A){
    int min=0;
   
   
    for(int i=0;i<A.length;i++){
        if(A[i]<min){
            min=i;
        }
        
    }
    int temp = min;
    min

    int min2=0;
    for(int i=0;i<A.length;i++){
        if(A[i]<min ){
            min=A[i];
        }
        
    }
    int min3=0;
    for(int i=0;i<A.length;i++){
        if(A[i]<min){
            min=A[i];
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
      
      minx(A);
      for(int s=0 ;s<A.length;s++){
        
        System.out.print(A[s]);
      }
     
    }
} 
























