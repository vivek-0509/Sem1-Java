import java.util.*;
class function6{
static void swap(int[]A){
   
   for(int i=0;i<A.length-1;i++){


for (int j = 0; j < A.length - 1-i ; j++) {
    if (A[j] > A[j + 1]) {
        
        int temp = A[j];
        A[j] = A[j + 1];
        A[j + 1] = temp;
    }
  
   }
   
// for (int j = i; j < i+1; j++) {
//     if (A[j] > A[j + 1]) {
        
//         int temp = A[j];
//         A[j] = A[j + 1];
//         A[j + 1] = temp;
//     }
  
//    }
     
    }
}

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
          
      for(int s=0;s<A.length;s++){
          
          A[s]=sc.nextInt();
          
        }
     swap(A);
     for(int s=0 ;s<A.length;s++){
        
        System.out.print(A[s]);
      }
    }
} 

