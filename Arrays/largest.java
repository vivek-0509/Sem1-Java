import java.util.*;
class largest{
    public static void main(String [] Args){
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
    
        for(int i=0;i<A.length;i++){
           A[i]=sc.nextInt();
        }

        int max=A[0];

        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
         }
         System.out.println(max);

         
    }
}