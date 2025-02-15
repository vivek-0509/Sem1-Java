import java.util.*;

public class findno1{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       
       int N=sc.nextInt();
       int [] A= new int[N];
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
      
       for(int i=0;i<A.length;i++){
        int temp=0;
        for(int j=0;j<A.length;j++){
         if(A[j]==A[i] && i!=j ){
            temp++;
            break;
         }
        }
        if(temp==0){
            System.out.print(A[i]);
        }
       }
      
    }
}
