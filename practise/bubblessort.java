import java.util.*;
class bubblessort{
   public static  int [] sort(int []A){
       for(int i=0;i<A.length;i++){
         for(int j=0;j<A.length-1-i;j++){
            if(A[j]>A[j+1]){
                int temp=A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
         }
       }
        return A;
            
            }
        
      
    
    public static void main(String [] args){
      Scanner sc=new Scanner (System.in);
       int N=sc.nextInt();
       
       int A[]=new int [N];
       
       for(int j=0;j<A.length;j++){
        A[j]=sc.nextInt();
    }
    sort(A);


    for(int j=0;j<A.length;j++){
        System.out.print(A[j]);
    }

    }
}