import java.util.*;
class function4{
static void sort(int[]A){
   
   for(int i=0;i<A.length-1;i++){
    int min=A[i];
    for(int j=i+1;j<A.length;j++){
    if(A[j]<min){
        min = A[j];
        
    }

   }
   int temp = A[i];
   A[i];

   }
   
 
     
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
          
      for(int s=0;s<A.length;s++){
          
          A[s]=sc.nextInt();
          
        }
     sort(A);
     for(int s=0 ;s<A.length;s++){
        
        System.out.print(A[s]);
      }
    }
} 
