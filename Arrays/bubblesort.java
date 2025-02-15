import java.util.*;

public class bubblesort{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int [] A= new int[N];
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
       
       for(int i=0;i<A.length-2;i++){
    
         for(int j=0;j<A.length-1-i;j++){
           if(A[j]>A[j+1]){
            // int temp=A[j+1];
            //   A[j+1]=A[j];
            //    A[j]=A[j+1];

               int temp = A[j];
               A[j] = A[j + 1];
               A[j + 1] = temp;
              
           }
         }
                
           
        }
     

       
       for(int i=0;i<A.length;i++){
        System.out.print(A[i]);
       }
       
    }
}
