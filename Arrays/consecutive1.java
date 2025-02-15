import java.util.*;

public class consecutive1{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       
       int N=sc.nextInt();
       int [] A= new int[N];
       for(int i=0;i<A.length;i++){
        A[i]=sc.nextInt();
       }
       int max=0;
       int c=0;
       for(int i=0;i<A.length;i++){
           if(A[i]==1){
            c++;
            // max=Math.max(max,c); both method correct
            if(c>max){
                max=c;
            }
            
           }
           else{
            c=0;
           }
       }
       System.out.print(max);
    }
}



